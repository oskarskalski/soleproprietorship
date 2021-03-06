package pl.oskarskalski.soleproprietorship.service.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.oskarskalski.soleproprietorship.exceptions.BadRequestException;
import pl.oskarskalski.soleproprietorship.features.NetRevenueCalculator;
import pl.oskarskalski.soleproprietorship.features.TaxCalculator;
import pl.oskarskalski.soleproprietorship.interfaces.crud.AddRevenueOps;
import pl.oskarskalski.soleproprietorship.model.PIT;
import pl.oskarskalski.soleproprietorship.model.Revenue;
import pl.oskarskalski.soleproprietorship.model.ZUS;
import pl.oskarskalski.soleproprietorship.repo.FakeRevenueRepo;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AddRevenueOpsService implements AddRevenueOps {
    private final FakeRevenueRepo fakeRevenueRepo;

    @Autowired
    public AddRevenueOpsService(FakeRevenueRepo fakeRevenueRepo) {
        this.fakeRevenueRepo = fakeRevenueRepo;
    }

    @Override
    public void addRevenueObject(double revenueAmount) {
        if(revenueAmount < 0)
            throw new BadRequestException();

        PIT pit = new PIT();
        NetRevenueCalculator netRevenueCalculator = new NetRevenueCalculator();
        TaxCalculator taxCalculator = new TaxCalculator();

        double taxAmount = taxCalculator.calculateTaxAmount(pit.getCurrentTaxPercent(), revenueAmount);
        double zusAmount = ZUS.ZUS_AMOUNT;
        double[] paymentAmounts = new double[]{taxAmount, zusAmount};

        double netRevenueAmount = netRevenueCalculator.calculateNetRevenueAmount(revenueAmount, paymentAmounts);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Revenue revenueObject = new Revenue();
        revenueObject.setRevenueGrossAmount(revenueAmount);
        revenueObject.setRevenueNetAmount(netRevenueAmount);
        revenueObject.setTaxPercent(pit.getCurrentTaxPercent());
        revenueObject.setTaxAmount(taxAmount);
        revenueObject.setZusAmount(zusAmount);
        revenueObject.setDate(simpleDateFormat.format(date));
        fakeRevenueRepo.add(revenueObject);
    }
}
