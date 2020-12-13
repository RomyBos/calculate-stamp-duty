package calculatestampduty;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StampDutyCalculatorTest {

    @Test
    public void Given_PropertyValue_When_Below125000_Then_NoTaxApplied() {
        StampDutyCalculator stCalculator = new StampDutyCalculator();
        assertEquals(0, stCalculator.calculateTax(100000));
    }

    @Test
    public void Given_PropertyValue_When_EqualTo125000_Then_NoTaxApplied() {
        StampDutyCalculator stCalculator = new StampDutyCalculator();
        assertEquals(0, stCalculator.calculateTax(125000));
    }

    @Test
    public void Given_PropertyValue_When_ValueBetween125000And250000_Then_2PercentTaxApplied() {
        StampDutyCalculator stCalculator = new StampDutyCalculator();
        assertEquals(1500, stCalculator.calculateTax(200000));
    }

    @Test
    public void Given_PropertyValue_When_EqualTo250000_Then_NoTaxApplied() {
        StampDutyCalculator stCalculator = new StampDutyCalculator();
        assertEquals(2500, stCalculator.calculateTax(250000));
    }

}
