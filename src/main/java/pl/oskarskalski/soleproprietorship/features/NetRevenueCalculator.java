package pl.oskarskalski.soleproprietorship.features;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NetRevenueCalculator {
    public double calculateNetRevenueAmount(double revenue, double[] values) {
        BigDecimal revenueAsBD = new BigDecimal(revenue);

        for (double amount : values) {
            BigDecimal amountAsBD = new BigDecimal(amount);
            revenueAsBD = revenueAsBD.subtract(amountAsBD).setScale(2, RoundingMode.HALF_EVEN);
        }

        return revenueAsBD.doubleValue();
    }

//    There's an issue about math operations on numbers which are floating-point. Processor can't make arithmetic calculations
//    using floating-point numbers, because processor works on binary system. It means that there is no way to save floating-point
//    number using 0-1 numbers. So for example if we want sum numbers like 1/10 and 2/10, the result will be 0.30000000000000004.
//    There's at least one method that can help to fix this issue in java. We can use class named BigDecimal that has high precision
//    in arithmetic calculations.


}
