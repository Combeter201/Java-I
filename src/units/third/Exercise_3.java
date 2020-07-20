package units.third;

import java.util.Scanner;

public class Exercise_3
{
    public static void main(String[] args)
    {
        //Reading a single char
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a single char:");
        char input = scanner.next().charAt(0);

        //Checking what kind of char input is
        String result = "";
        if (input >= 'A' && input <= 'Z')
        {
            result += "Uppercase letter, ";
        }
        if (input == '0' || input == '1')
        {
            result += "Binary number, ";
        }
        if (input >= '0' && input <= '7')
        {
            result += "Octal number, ";
        }
        if ((input >= 'A' && input <= 'F') || (input >= 'a' && input <= 'f' || (input >= '0' && input <= '9')))
        {
            result += "Hexadecimal number, ";
        } else
        {
            result = "Unknown Character";
        }
        System.out.println(result);

        scanner.close();
    }
}
