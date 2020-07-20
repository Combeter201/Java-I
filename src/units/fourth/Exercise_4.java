package units.fourth;

import java.util.Scanner;

public class Exercise_4
{
    public static void main(String[] args)
    {
        //Reading a year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a year: ");
        int date = scanner.nextInt();

        //Proofing if year is a leap-year or not
        if ((date % 4 == 0) && (date % 100 != 0 || date % 400 == 0))
        {
            System.out.println(date + " is a leap-year");
        } else
        {
            System.out.println(date + " is not a leap-year");
        }
        scanner.close();
    }
}
