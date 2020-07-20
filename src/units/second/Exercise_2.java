package units.second;

public class Exercise_2
{
    public static void main(String[] args)
    {
        int radius = 3;

        //Calculate area of Circle
        float area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.printf("%.3f%n", area);

        //Calculate scope of Circle
        float scope = (float) (2 * Math.PI * radius);
        System.out.printf("%.3f%n", scope);

        //Calculate volume of Sphere
        float volume = (float) (4/3 * Math.PI * Math.pow(radius, 3));
        System.out.printf("%.3f%n", volume);
    }
}
