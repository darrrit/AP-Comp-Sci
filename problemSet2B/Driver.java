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
        StringTools sTools = new StringTools();

        System.out.println("lastLetter test case");
        System.out.print("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");

        System.out.print("\n Phone number test case \n Enter a ten digit number: ");
        String answer2 = input.nextLine();
        System.out.println( "Formated Number: " + sTools.formatPhoneNumber(answer2) + "\n---------------------");
        
        System.out.print("\n three middle letters test case \n Enter a string with at least 3 letters and an odd length: ");
        String answer3 = input.nextLine();
        System.out.println("The middle three letters are: " + sTools.middleThree(answer3) + "\n---------------------");
    }
}