package calculatestampduty;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class StampDutyCalculator {
    public double calculateTax(int propertyValue) {
        LinkedHashMap<Double, Double> taxRates = getTaxRates();
        double totalSDLT = 0;
        double calculated = 0;

        for (HashMap.Entry<Double, Double> entry : taxRates.entrySet()) {
            double portionValue = entry.getKey();
            double portionTax = entry.getValue();
            double portion = (portionValue - calculated);
            if (propertyValue > portionValue){    // Calculate the tax for this portion
                totalSDLT += portion * portionTax;
                calculated += portion;
            } else if (propertyValue <= portionValue) {   // Calculate the tax for the remaining amount in this portion
                totalSDLT += (propertyValue - calculated) * portionTax;
                break;
            }
        }
        return totalSDLT;
    }

    public LinkedHashMap<Double, Double> getTaxRates() {
        LinkedHashMap<Double, Double> taxRates = new LinkedHashMap<>();

        taxRates.put(125000., 0.);
        taxRates.put(250000., 0.02);
        taxRates.put(925000., 0.05);

        return taxRates;
    }
}
