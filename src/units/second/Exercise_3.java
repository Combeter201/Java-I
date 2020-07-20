package units.second;

public class Exercise_3
{
    public static void main(String[] args)
    {
        //Solve PQ-Formula
        int p = 7;
        int q = 5;

        float x1 = (float) (-p/2f + Math.sqrt(Math.pow(p/2f, 2) - q));
        float x2 = (float) (-p/2f - Math.sqrt(Math.pow(p/2f, 2) - q));

        System.out.printf("%s%.3f%n%s%.3f", "x1:", x1, "x2:", x2);
    }
}
