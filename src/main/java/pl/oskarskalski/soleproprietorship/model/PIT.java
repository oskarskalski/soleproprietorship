package pl.oskarskalski.soleproprietorship.model;

import java.math.BigDecimal;

public class PIT {
    private final BigDecimal currentTaxPercent = new BigDecimal("0.19");

    public double getCurrentTaxPercent() {
        return currentTaxPercent.doubleValue();
    }

    public double calculateTaxAmount(double revenue){
        BigDecimal transformRevenueToBigDecimalValue = new BigDecimal(revenue);
        BigDecimal result = transformRevenueToBigDecimalValue.multiply(currentTaxPercent);
        return result.doubleValue();
    }
}
