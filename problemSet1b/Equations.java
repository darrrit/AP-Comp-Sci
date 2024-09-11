/** 
 * Naomi Wolfman
 * Question set 1B
 * Sept. 11, 2024
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Equations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("*** Celsius --> Fahrenheit ***");  
        System.out.print("Enter a temperature in Celsius: ");
        double celcius = input.nextInt();
        double fahrenheit = celcius * 9 / 5 + 32;
        System.out.println(celcius + "° Celsius = " + fahrenheit + "° Fahrenheit");

        double tall, heavy;
        long BMI;
        System.out.println("*** BMI Calculator ***");
        System.out.print("Enter a weight in kg: ");
        heavy = input.nextDouble();
        System.out.print("Enter a height in m: ");
        tall = input.nextDouble();
        BMI = Math.round (heavy / (Math.pow(tall, 2)));
        System.out.println("A "+ tall + " tall adult who weighs " + heavy + " has a BMI of " + BMI);

        int days, dRemainder, weeks;
        System.out.println("*** Days --> Weeks and Days ***");
        System.out.print("Enter a number of days: ");
        days = input.nextInt();
        weeks = days/7;
        dRemainder = days % 7;
        System.out.println(days + " days is equal to " + weeks + " weeks, " + dRemainder + " days");

        int nBought;
        double unitP, taxR,tPrice; 
        System.out.println("*** Receipt Generator ***");
        System.out.print("Number of units you're buying: ");
        nBought = input.nextInt();
        System.out.print("Price per unit: ");
        unitP = input.nextDouble();
        System.out.print("Tax rate: ");
        taxR = input.nextDouble();
        tPrice = (unitP*nBought)*((taxR/100) + 1);
        String formatValue = df.format(tPrice);
        System.out.println("Purchasing " + nBought + " units at $" + unitP + " with " + taxR + "% tax will cost $" + formatValue);
        
        int numIn, numOut, ones, tens, hundos;
        System.out.println("*** Sum of digits ***");
        System.out.print("Enter a positive, three-digit number: ");
        numIn = input.nextInt();
        hundos = numIn / 100;
        tens = (numIn % 100) / 10;
        ones = (numIn % 10);
        numOut = hundos + tens + ones;
        System.out.print("The sum of the digits of " + numIn + " is " + numOut);
        
        input.close();
        
    }

}

/*
 *** Celsius --> Fahrenheit ***
Enter a temperature in Celsius: 30
30.0° Celsius = 86.0° Fahrenheit

 *** BMI Calculator ***
Enter a weight in kg: 50
Enter a height in m: 1.6
A 1.6m tall adult who weighs 50.0kg has a BMI of 19.531249999999996

 *** Days --> Weeks and Days ***
Enter a number of days: 45
45 days is equal to 6 weeks, 3 days.

 *** Receipt Generator ***
Number of units you're buying: 5
Price per unit: 20
Tax rate: 5
Purchasing 5 units at $20.0 with 5.0% tax will cost $105.0

 *** Sum of digits ***
Enter a positive, three-digit number: 123
The sum of the digits of 123 is 6
 */