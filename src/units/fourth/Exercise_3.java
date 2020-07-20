package units.fourth;

import java.util.Scanner;

public class Exercise_3
{
    public static void main(String[] args)
    {
        //Reading two Boolean
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first boolean value: ");
        char firstBool = scanner.nextLine().charAt(0);
        System.out.println("Type in the second boolean value: ");
        char secondBool = scanner.nextLine().charAt(0);

        //Output of the specific combination
        if (firstBool == 'f' && secondBool == 'f')
        {
            System.out.println("0");
        } else if (firstBool == 'f' && secondBool == 't')
        {
            System.out.println("1");
        } else if (firstBool == 't' && secondBool == 'f')
        {
            System.out.println("2");
        } else if (firstBool == 't' && secondBool == 't')
        {
            System.out.println("3");
        } else
        {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
