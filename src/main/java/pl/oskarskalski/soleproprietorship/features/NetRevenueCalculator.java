package pl.oskarskalski.soleproprietorship.features;

import java.math.BigDecimal;

public class NetRevenueCalculator {
    public double calculateNetRevenueAmount(double revenue, double[] values) {
        int netRevenueAmount = (int) revenue * 100;
        for (double amount : values) {
            netRevenueAmount -= (int)(amount * 100);
        }
        return ((double)netRevenueAmount) / 100;
    }

//    public double calculateNetRevenueAmount(double revenue, double[] values) {
//        BigDecimal revenueAsBD = new BigDecimal(revenue);
//
//        for (double amount : values) {
//            BigDecimal amountAsBD = new BigDecimal(amount);
//            revenueAsBD = revenueAsBD.subtract(amountAsBD);
//        }
//
//
//        return revenueAsBD.doubleValue();
//    }
}
