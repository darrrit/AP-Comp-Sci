/** 
 * Naomi Wolfman
 * sept. 25 2024
 * 1-3
 * Problem set 2B
 */

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("lastLetter test case");
        System.out.print("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + StringTools.lastLetter(answer1));
        System.out.println("---------------------");

        System.out.print("\nPhone number test case \nEnter a ten digit number: ");
        String answer2 = input.nextLine();
        System.out.println( "Formated Number: " + StringTools.formatPhoneNumber(answer2) + "\n---------------------");
         
        System.out.print("\nthree middle letters test case \nEnter a string with at least 3 letters and an odd length: ");
        String answer3 = input.nextLine();
        System.out.println("The middle three letters are: " + StringTools.middleThree(answer3) + "\n---------------------");

       
        System.out.print("\nSwap letters test case \nEnter a string with at least 2 charecters : ");
        String answer4 = input.nextLine();
        System.out.println("Your new word is: " + StringTools.swapLastTwo(answer4) + "\n---------------------");

        System.out.print("\nCheck letters test case \nEnter a string and number; the number is smaller or equal to the string length : ");
        String answer5p1 = input.nextLine();
        int answer5p2 = input.nextInt();
        System.out.println("your values are equal: " + StringTools.frontAgain(answer5p1, answer5p2) + "\n---------------------");

    }
}