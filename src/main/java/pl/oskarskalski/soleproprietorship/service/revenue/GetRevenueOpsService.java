package pl.oskarskalski.soleproprietorship.service.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.oskarskalski.soleproprietorship.exceptions.BadRequestException;
import pl.oskarskalski.soleproprietorship.exceptions.NotFoundException;
import pl.oskarskalski.soleproprietorship.interfaces.crud.GetRevenueOps;
import pl.oskarskalski.soleproprietorship.model.Revenue;
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
    public List<Revenue> findAllRevenueObjects() {
        List<Revenue> revenueList = fakeRevenueRepo.getAllRevenueList();
        if(revenueList.size() == 0)
            throw new NotFoundException();

        return revenueList;
    }

    @Override
    public List<Revenue> findAllRevenueObjectsByOrderAndRange(String orderBy, int range) {
        if(range < 0)
            throw new BadRequestException();

        List<Revenue> revenueList = fakeRevenueRepo.findAllRevenueObjectsByRangeOrderBy(range, orderBy);

        if(revenueList.size() == 0)
            throw new NotFoundException();

        return revenueList;
    }

}
