/** 
 * i am naomi
 * sept. 9 2024
 * we do be scanning
 */

import java.util.Scanner;

public class studentQuestions {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What's your favourite course?: ");
    String favCourse = input.nextLine();
   
    
    System.out.print("What's your favourite show?: ");
    String favShow = input.nextLine();
   
    
    System.out.print("How many hours do you spent studying each day?: ");
    int studyHours = input.nextInt();

    System.out.print("How many hours do you spend watching TV each day?: ");
    int TVHours = input.nextInt();
    
    System.out.println(" ");
    
    System.out.println("Summary:");
    System.out.println("Your favourite course is: " + favCourse + ".");
    System.out.println("Your favourite show is: " + favShow + ".");
    System.out.println("You spend " + studyHours + " hours studying each day" + ".");
    System.out.println("You spend " + TVHours + " watching TV each day.");
    System.out.println("In total, you spend " + (studyHours + TVHours) + " studying and watching TV each day.");
    
    input.close();
    
    }
}