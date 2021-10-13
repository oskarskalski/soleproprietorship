package pl.oskarskalski.soleproprietorship.service.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.oskarskalski.soleproprietorship.features.NetRevenueCalculator;
import pl.oskarskalski.soleproprietorship.interfaces.crud.AddRevenueOps;
import pl.oskarskalski.soleproprietorship.model.PIT;
import pl.oskarskalski.soleproprietorship.model.Revenue;
import pl.oskarskalski.soleproprietorship.model.ZUS;
import pl.oskarskalski.soleproprietorship.repo.FakeRevenueRepo;

@Service
public class AddRevenueOpsService implements AddRevenueOps {
    private final FakeRevenueRepo fakeRevenueRepo;

    @Autowired
    public AddRevenueOpsService(FakeRevenueRepo fakeRevenueRepo) {
        this.fakeRevenueRepo = fakeRevenueRepo;
    }

    @Override
    public void addRevenueObject(double revenueAmount) {
        PIT pit = new PIT();
        NetRevenueCalculator netRevenueCalculator = new NetRevenueCalculator();

        double taxAmount = pit.calculateTaxAmount(revenueAmount);
        double zusAmount = ZUS.ZUS_AMOUNT;
        double[] paymentAmounts = new double[]{taxAmount, zusAmount};

        double netRevenueAmount = netRevenueCalculator.calculateNetRevenue(revenueAmount, paymentAmounts);

        Revenue revenueObject = new Revenue();
        revenueObject.setRevenueGrossAmount(revenueAmount);
        revenueObject.setRevenueNetAmount(netRevenueAmount);
        revenueObject.setTaxPercent(pit.getCurrentTaxPercent());
        revenueObject.setTaxAmount(taxAmount);
        revenueObject.setZusAmount(zusAmount);


        fakeRevenueRepo.addRevenueObject(revenueObject);
    }
}
