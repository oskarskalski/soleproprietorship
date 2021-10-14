package pl.oskarskalski.soleproprietorship;

import org.junit.jupiter.api.Test;
import pl.oskarskalski.soleproprietorship.features.TaxCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTests {
    private final TaxCalculator taxCalculator = new TaxCalculator();

    @Test
    void GivenAreTaxPercentAndRevenueAmount__ExceptCorrectValue__ReturnsCorrectValue(){
        double taxPercent = 0.19;
        double revenueAmount = 10000.0;
        double taxAmount = 1900.0;

        double result = taxCalculator.calculateTaxAmount(taxPercent, revenueAmount);

        assertEquals(taxAmount, result);
    }
}
