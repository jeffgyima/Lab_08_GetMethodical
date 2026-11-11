public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.printf("%10s %10s%n", "Celsius", "Fahrenheit");
        System.out.printf("%10s %10s%n", "-------", "----------");
        for (int c = -100; c <= 100; c++)
        {
            System.out.printf("%10d %10.1f%n", c, CtoF(c));
        }
    }

    public static double CtoF(double Celsius)
    {
        return (Celsius * 9.0 / 5.0) + 32;
    }
}