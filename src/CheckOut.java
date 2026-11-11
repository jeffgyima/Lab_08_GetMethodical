import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean more = true;

        do
        {
            double price = SafeInput.getRangedDouble(in, "Enter the item price", 0.50, 10.00);
            total += price;
            more = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (more);

        System.out.printf("%nThe total cost is $%.2f%n", total);
    }
}