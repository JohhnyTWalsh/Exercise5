/**
 * Created by t00195834 on 19/09/2017.
 */
import java.util.Scanner;
public class Exercise6 {
    public static void main(String args[]) {
        String Input;
        float SwitchInput1, SwitchInput2;
        char Decision;
        int Looper = 0;
        boolean Valid;

        Scanner j = new Scanner(System.in);

        System.out.print("Please choose from the following decisions, \n'A' For Addition, \n'S' For Subtraction, \n'M' For Multiplication, \nor 'D' For Division: ");
        Input = j.nextLine();

        Input = Input.toUpperCase();

        Decision = Input.charAt(0);

        Valid = false;
        while (!Valid && !Input.equals("Q"))

            if()

            switch (Decision) {
                case 'A':
                    System.out.print("Please enter the first number you would like to add: ");
                    SwitchInput1 = j.nextInt();
                    System.out.print("Please enter the second number you would like to add: ");
                    SwitchInput2 = j.nextInt();
                    System.out.println("Your answer is: " + (SwitchInput1 + SwitchInput2));
                    Valid = false;
                    break;

                case 'S':
                    System.out.print("Please enter the first number you would like to subtract: ");
                    SwitchInput1 = j.nextInt();
                    System.out.print("Please enter the second number you would like to subtract: ");
                    SwitchInput2 = j.nextInt();
                    System.out.println("Your answer is: " + (SwitchInput1 - SwitchInput2));
                    Valid = false;
                    break;

                case 'M':
                    System.out.print("Please enter the first number you would like to multiply: ");
                    SwitchInput1 = j.nextInt();
                    System.out.print("Please enter the second number you would like to multiply: ");
                    SwitchInput2 = j.nextInt();
                    System.out.println("Your answer is: " + (SwitchInput1 * SwitchInput2));
                    Valid = false;
                    break;

                case 'D':
                    System.out.print("Please enter the first number you would like to divide: ");
                    SwitchInput1 = j.nextInt();
                    System.out.print("Please enter the second number you would like to divide: ");
                    SwitchInput2 = j.nextInt();
                    System.out.println("Your answer is: " + (SwitchInput1 / SwitchInput2));
                    Valid = false;
                    break;

                default:
                    System.out.print("Incorrect Answer! Please Enter \nA: For Addition,\nS: For Subtraction,\nM: For Multiplication\nD: For Division\n:");
                    Input = j.nextLine();
                    Input = Input.toUpperCase();
                    Decision = Input.charAt(0);
                    Valid = false;
            }
    }
}

