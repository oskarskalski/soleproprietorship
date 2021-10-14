package pl.oskarskalski.soleproprietorship;

import org.junit.jupiter.api.Test;
import pl.oskarskalski.soleproprietorship.features.NetRevenueCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetRevenueCalculatorTests {
    private final NetRevenueCalculator netRevenueCalculator = new NetRevenueCalculator();
    @Test
    void GivenAreValues__ExceptReturnCorrectResult__ReturnedCorrectValue(){
        double revenueAmount = 10000.0;
        double zusAmount = 1380.18;
        double taxAmount = 1900;

        double result = netRevenueCalculator.calculateNetRevenueAmount(revenueAmount, new double[]{zusAmount, taxAmount});
        double correctResult = 6719.82;
        assertEquals(correctResult, result);
    }
}
