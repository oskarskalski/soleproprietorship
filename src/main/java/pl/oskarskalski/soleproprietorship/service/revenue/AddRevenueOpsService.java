package pl.oskarskalski.soleproprietorship.service.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.oskarskalski.soleproprietorship.interfaces.crud.AddRevenueOps;
import pl.oskarskalski.soleproprietorship.repo.FakeRevenueRepo;

@Service
public class AddRevenueOpsService implements AddRevenueOps {
    private final FakeRevenueRepo fakeRevenueRepo;

    @Autowired
    public AddRevenueOpsService(FakeRevenueRepo fakeRevenueRepo) {
        this.fakeRevenueRepo = fakeRevenueRepo;
    }

    @Override
    public void addRevenueObject(Object revenueObject) {
        fakeRevenueRepo.addRevenueObject(new Object());
    }
}
