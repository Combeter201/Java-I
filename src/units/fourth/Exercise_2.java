package units.fourth;

import java.util.Scanner;

public class Exercise_2
{
    public static void main(String[] args)
    {
        //Reading a time
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the number of hours: ");
        int hours = scanner.nextInt();

        System.out.println("Type in the number of minutes: ");
        int minutes = scanner.nextInt();

        System.out.println("Type in the number of seconds: ");
        int seconds = scanner.nextInt();

        //Proofing if time is valid
        if ((hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59))
        {
            System.out.println(hours + ":" + minutes + ":" + seconds + " is a valid Time");
        } else
        {
            System.out.println(hours + ":" + minutes + ":" + seconds + " is a invalid Time");
        }
        scanner.close();
    }
}
