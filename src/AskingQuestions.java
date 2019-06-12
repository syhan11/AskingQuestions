/*
 * This application takes 2 integer values and finds the largest one.
 * Change the application so that it finds the average of two double values.
 */
import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();

        num3 = (num1 + num2)/2;

        System.out.println("The max value is : " + Math.max(num1, num2));
        System.out.println("The average value is " + num3);
    }
}
