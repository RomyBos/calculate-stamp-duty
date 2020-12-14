package calculatestampduty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StampDutyCalculator sdlt = new StampDutyCalculator();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of the Property you want to calculate the tax for: ");
        int propertyValue = in.nextInt();
        sdlt.calculateTax(propertyValue);
    }
}
