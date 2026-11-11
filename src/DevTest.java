import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Scratch-test each SafeInput method here, then copy into SafeInput.
        String s = SafeInput.getNonZeroLenString(in, "Enter something");
        System.out.println("Got: " + s);

        int i = SafeInput.getInt(in, "Enter an int");
        System.out.println("Got: " + i);

        double d = SafeInput.getDouble(in, "Enter a double");
        System.out.println("Got: " + d);

        int ri = SafeInput.getRangedInt(in, "Enter an int", 1, 10);
        System.out.println("Got: " + ri);

        double rd = SafeInput.getRangedDouble(in, "Enter a double", 0.5, 10.0);
        System.out.println("Got: " + rd);

        boolean yn = SafeInput.getYNConfirm(in, "Continue?");
        System.out.println("Got: " + yn);

        String r = SafeInput.getRegExString(in, "Enter a M number", "^(M|m)\\d{5}$");
        System.out.println("Got: " + r);

        SafeInput.prettyHeader("Message Centered Here");
    }
}