import java.io.*;
import java.util.Scanner;

public class Grade_if_else{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    char grade;

    System.out.println("Please enter your current letter average. ");
    grade = keyboard.next().charAt(0);
    
    if (grade == 'A') 
        System.out.println("Your work is outstanding!");
      else if (grade == 'B')
        System.out.println("You are doing good work!");
     else if (grade == 'C')
         System.out.println("Your work is satisfactory.");
      else if (grade == 'D')
        System.out.println("You need to work a little harder.");
      else if (grade == 'E')
         System.out.println("Please see me for extra help!");
      else
        System.out.println("That is not a logical letter grade.");
    }  // of main method
    
  public static void func() {
        Scanner keyboard = new Scanner(System.in);

        char grade;

        System.out.println("Please enter your current letter average. ");
        grade = keyboard.next().charAt(0);

        switch(grade){
            case ('A'):{
                System.out.println("Your work is outstanding!");
            }
            case ('B'):{
                System.out.println("You are doing good work!");
            }
            case ('C'):{
                System.out.println("Your work is satisfactory.");
            }
            case ('D'):{
                System.out.println("You need to work a little harder.");
            }
            case ('F'):{
                System.out.println("Please see me for extra help!");
            }
            default:{
                System.out.println("That is not a logical letter grade.");
            }
        }
        System.out.println("--end--");
    }  // of main method
}   // of class definition

