package calculatestampduty;

import java.util.HashMap;



public class StampDutyCalculator {
    public double calculateTax(int propertyValue) {
        HashMap<Double, Double> taxRates = getTaxRates();
        double totalSDLT = 0;
        double calculated = 0;

        for (HashMap.Entry<Double, Double> entry : taxRates.entrySet()) {
            if (propertyValue > entry.getKey()){    // Calculate the tax for this portion
                totalSDLT += (entry.getKey() - calculated) * entry.getValue();
                calculated += (entry.getKey() - calculated);
            } else if (propertyValue <= entry.getKey()) {   // Calculate the tax for the remaining amount in this portion
                totalSDLT += (propertyValue - calculated) * entry.getValue();
                break;
            }
        }
        return totalSDLT;
    }

    public HashMap<Double, Double> getTaxRates() {
        HashMap<Double, Double> taxRates = new HashMap<>();

        taxRates.put(125000., 0.);
        taxRates.put(250000., 0.02);

        return taxRates;
    }
}
