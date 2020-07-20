package units.third;

import java.util.Scanner;

public class Exercise_1
{
    public static void main(String[] args)
    {
        //Reading a integer number from User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a integer number:");
        int number = scanner.nextInt();

        //Using the modulo operator to proof if the number is integer divisible by 7
        System.out.println("The Number is" + (number % 7 == 0 ? "" : " not") + " integer divisible by 7");

        scanner.close();
    }
}
