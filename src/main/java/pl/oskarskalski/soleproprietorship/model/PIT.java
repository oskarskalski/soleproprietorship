package pl.oskarskalski.soleproprietorship.model;

import java.math.BigDecimal;

public class PIT {
    private final double currentTaxPercent = 0.19;

    public double getCurrentTaxPercent() {
        return currentTaxPercent;
    }

    public double calculateTaxAmount(double revenue) {
        int convertTaxPercentToIntValue = (int) (currentTaxPercent * 100);
        int convertRevenueAmountToIntValue = (int) (revenue * 100);

        int taxAmount = convertRevenueAmountToIntValue * convertTaxPercentToIntValue;

        return ((double) taxAmount) / 100;
    }

//    public double calculateTaxAmount(double revenue){
//        BigDecimal revenueAmountAsBD = new BigDecimal(revenue);
//        BigDecimal taxPercentAsBG = new BigDecimal(currentTaxPercent);
//        BigDecimal result = revenueAmountAsBD.multiply(taxPercentAsBG);
//        return result.doubleValue();
//    }
}
