package pl.oskarskalski.soleproprietorship.features;

import java.math.BigDecimal;

public class NetRevenueCalculator {
    public double calculateNetRevenueAmount(double revenue, double[] values) {
        BigDecimal revenueAsBD = new BigDecimal(revenue);

        for (double amount : values) {
            BigDecimal amountAsBD = new BigDecimal(amount);
            revenueAsBD = revenueAsBD.subtract(amountAsBD);
        }

        return revenueAsBD.doubleValue();
    }

//    There's an issue about math operations on numbers which are floating-point. Processor can't make arithmetic calculations
//    using floating-point numbers, because processor works on binary system. It means that there is no way to save floating-point
//    number using 0-1 numbers. So for example if we want sum numbers like 1/10 and 2/10, the result will be 0.30000000000000004.
//    There's at least two methods that can fix this issue. We can use class named BigDecimal that has high precision
//    in arithmetic calculations, or we can multiply numbers by 100 to make numbers which has 2 digits after comma.
//    Then make calculations and after that we can divide it by 100, and in result we should get correct result.

//    public double calculateNetRevenueAmount(double revenue, double[] values) {
//        int netRevenueAmount = (int) revenue * 100;
//        for (double amount : values) {
//            netRevenueAmount -= (int) (amount * 100);
//        }
//        return ((double) netRevenueAmount) / 100;
//    }

}
