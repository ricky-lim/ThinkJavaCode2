package exercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature in Celcius: ");
        celsius = in.nextDouble();
        fahrenheit = toFahrenheit(celsius);
        System.out.printf("%.1f C = %.1f\n", celsius, fahrenheit);
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9) / 5.0 + 32;
    }
}
