package calculatestampduty;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StampDutyCalculatorTest {

    @Test
    public void Given_Property_When_ValueBelow125000_Then_NoTaxApplied() {
        StampDutyCalculator stCalculator = new StampDutyCalculator();
        assertEquals(0, stCalculator.calculateTax(100000));
    }

    @Test
    public void Given_Property_When_ValueEqualTo125000_Then_NoTaxApplied() {
        StampDutyCalculator stCalculator = new StampDutyCalculator();
        assertEquals(0, stCalculator.calculateTax(125000));
    }

}
