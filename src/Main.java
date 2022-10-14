
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");


        NumberFormat us = NumberFormat.getCurrencyInstance();
        us.setCurrency(Currency.getInstance(Locale.US));
        NumberFormat india = NumberFormat.getCurrencyInstance();
        india.setCurrency(Currency.getInstance(indiaLocale));
        NumberFormat china = NumberFormat.getCurrencyInstance();
        china.setCurrency(Currency.getInstance(Locale.CHINA));
        NumberFormat france = NumberFormat.getCurrencyInstance();
        france.setCurrency(Currency.getInstance(Locale.FRANCE));
        NumberFormat numero = NumberFormat.getNumberInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));
        numero.setMinimumFractionDigits(2);
        numero.setMaximumFractionDigits(2);
        nf.setMaximumFractionDigits(2);



        // Write your code here.

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.getCurrency().getSymbol(indiaLocale) + " " + numero.format(payment));
        System.out.println("China: " + china.getCurrency().getSymbol(Locale.CHINA) + numero.format(payment));
        System.out.println("France: " + nf.format(payment));
    }
}
