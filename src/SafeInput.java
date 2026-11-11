import java.util.Scanner;

public class SafeInput
{
    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the newline
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return any valid double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a number, not: " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user (range is appended automatically)
     * @param low low end of the inclusive range
     * @param high high end of the inclusive range
     * @return an int within [low, high]
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number out of range: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user (range is appended automatically)
     * @param low low end of the inclusive range
     * @param high high end of the inclusive range
     * @return a double within [low, high]
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number out of range: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a number, not: " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user ([Y/N] is appended automatically)
     * @return true for Y/y, false for N/n
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean retVal = false;
        boolean done = false;
        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("Please enter Y or N, not: " + response);
            }
        } while (!done);
        return retVal;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx the regular expression the input must match
     * @return a String that matches the regEx
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response = "";
        boolean done = false;
        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Input does not match the required pattern: " + response);
            }
        } while (!done);
        return response;
    }

    /**
     * Displays msg centered in a 3-line, 60-character-wide star banner.
     * @param msg the message to center
     */
    public static void prettyHeader(String msg)
    {
        final int WIDTH = 60;
        final int EDGE = 3;
        int inner = WIDTH - 2 * EDGE;               // 54 characters for the message area
        int leftPad = (inner - msg.length()) / 2;
        int rightPad = inner - msg.length() - leftPad;

        for (int i = 0; i < WIDTH; i++) System.out.print("*");
        System.out.println();

        for (int i = 0; i < EDGE; i++) System.out.print("*");
        for (int i = 0; i < leftPad; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < rightPad; i++) System.out.print(" ");
        for (int i = 0; i < EDGE; i++) System.out.print("*");
        System.out.println();

        for (int i = 0; i < WIDTH; i++) System.out.print("*");
        System.out.println();
    }
}



