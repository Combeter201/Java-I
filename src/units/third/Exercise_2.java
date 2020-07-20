package units.third;

import java.util.Scanner;

public class Exercise_2
{
    public static void main(String[] args)
    {
        //Reading the size and prize of two pizzas to compare them
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the size of the first pizza:");
        float firstSize = scanner.nextInt();

        System.out.println("Please type in the prize of the first pizza:");
        float firstPrize = scanner.nextInt();

        System.out.println("Please type in the size of the second pizza:");
        float secondSize = scanner.nextInt();

        System.out.println("Please type in the prize of the second pizza:");
        float secondPrize = scanner.nextInt();

        //Output the Pizza with the better size/prize ratio
        if (firstSize / firstPrize > secondSize / secondPrize)
        {
            System.out.println("The first Pizza has the better prize/size ratio");
        } else if (firstSize / firstPrize < secondSize / secondPrize)
        {
            System.out.println("The second Pizza has the better prize/size ratio");
        } else
        {
            System.out.println("Both Pizzas have the same prize/size ratio ");
        }
        scanner.close();
    }
}
