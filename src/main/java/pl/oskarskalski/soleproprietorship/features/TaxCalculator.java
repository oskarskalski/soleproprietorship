package pl.oskarskalski.soleproprietorship.features;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {
    public double calculateTaxAmount(double currentTaxPercent, double revenue) {
        BigDecimal revenueAmountAsBD = new BigDecimal(revenue);
        BigDecimal taxPercentAsBG = new BigDecimal(currentTaxPercent);
        BigDecimal result = revenueAmountAsBD.multiply(taxPercentAsBG);
        return result.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

//    See NetRevenueCalculator.java file to see some explanation about this code
}
