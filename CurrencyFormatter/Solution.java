package CurrencyFormatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        DecimalFormat dfZero = new DecimalFormat("0.00");
        payment = Double.parseDouble(dfZero.format(payment));


        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);


        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);


        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);


        NumberFormat indFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = indFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
