package pl.oskarskalski.soleproprietorship.service.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.oskarskalski.soleproprietorship.interfaces.crud.GetRevenueOps;
import pl.oskarskalski.soleproprietorship.repo.FakeRevenueRepo;

import java.util.List;

@Service
public class GetRevenueOpsService implements GetRevenueOps {
    private final FakeRevenueRepo fakeRevenueRepo;

    @Autowired
    public GetRevenueOpsService(FakeRevenueRepo fakeRevenueRepo) {
        this.fakeRevenueRepo = fakeRevenueRepo;
    }

    @Override
    public List<Object> getAllRevenueObjects() {
        return fakeRevenueRepo.getAllRevenueList();
    }

    @Override
    public List<Object> getRevenueObjectListByRangeAndRightDirection(int range) {
        return fakeRevenueRepo.getRevenueListByRange(range, "finish");
    }

    @Override
    public List<Object> getRevenueObjectListByRangeAndLeftDirection(int range) {
        return fakeRevenueRepo.getRevenueListByRange(range, "start");
    }
}
