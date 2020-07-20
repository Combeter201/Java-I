package units.third;

public class Exercise_4
{
    public static void main(String[] args)
    {
        //Rolling a dice
        int dice = (int) (Math.random() * 6 + 1);
        String[] diceArray = {"one", "two", "three", "four", "five", "six"};

        System.out.println("You've rolled a " + diceArray[dice - 1]);
    }
}
