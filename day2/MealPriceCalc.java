import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MealPriceCalc {

    public static void main(String[] args) {
        double mealCost;
        int tipPercent, taxPercent, totalCost;

        Scanner scan = new Scanner(System.in);

        mealCost = scan.nextDouble();
        tipPercent = scan.nextInt();
        taxPercent = scan.nextInt();
        scan.close();

        totalCost = (int) Math.round(mealCost * (1 + (tipPercent / 100.0)) + 
                    (mealCost * (taxPercent / 100.0)));
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

}
