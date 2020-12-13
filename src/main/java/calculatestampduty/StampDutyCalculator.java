package calculatestampduty;

import java.util.HashMap;



public class StampDutyCalculator {
    public double calculateTax(int propertyValue) {
        HashMap<Double, Double> taxRates = getTaxRates();
        double totalSDLT = 0;

        for (HashMap.Entry<Double, Double> entry : taxRates.entrySet()) {
            if (propertyValue >= entry.getKey()){
                totalSDLT = propertyValue * entry.getValue();
            }
        }
        return (double) Math.round(totalSDLT);
    }

    public HashMap<Double, Double> getTaxRates() {
        HashMap<Double, Double> taxRates = new HashMap<>();

        taxRates.put(125000., 0.);

        return taxRates;
    }
}
