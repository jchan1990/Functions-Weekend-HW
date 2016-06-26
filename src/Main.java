/**
 * Created by Jason on 6/26/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(sleepIn(true, true));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(false, false));
        System.out.println();
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
        System.out.println();
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));

    }

    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    */
    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        else {
            return 2 * (a + b);
        }
    }

    /*
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
    */
    public static int close10(int a, int b) {
        int aValueAbsolute = Math.abs(a - 10);
        int bValueAbsolute = Math.abs(b - 10);

        if (aValueAbsolute < bValueAbsolute) {
            return a;
        }
        else if (bValueAbsolute < aValueAbsolute) {
            return b;
        }

        return 0;
    }

}
