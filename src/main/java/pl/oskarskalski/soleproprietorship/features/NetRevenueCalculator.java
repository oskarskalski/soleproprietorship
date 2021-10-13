package pl.oskarskalski.soleproprietorship.features;

import java.math.BigDecimal;

public class NetRevenueCalculator {
    public double calculateNetRevenue(double revenue, double[] values) {
        BigDecimal revenueAsBD = new BigDecimal(revenue);

        for (double amount : values) {
            BigDecimal amountAsBD = new BigDecimal(amount);
            revenueAsBD = revenueAsBD.subtract(amountAsBD);
        }


        return revenueAsBD.doubleValue();
    }
}
