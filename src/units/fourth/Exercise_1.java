package units.fourth;

import java.util.Scanner;

public class Exercise_1
{
    public static void main(String[] args)
    {
        //Reading a matriculation number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your matriculation number: ");
        int number = (int) (scanner.nextInt() / 1e5);

        //Proofing if number is valid
        if (number == 50 || number == 51 || number == 61)
        {
            System.out.println("Your matriculation number is valid");
        } else
        {
            System.out.println("Your matriculation number is invalid");
        }
        scanner.close();
    }
}
