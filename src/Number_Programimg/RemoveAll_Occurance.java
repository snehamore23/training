package Number_Programimg;

public class RemoveAll_Occurance {

    public static void main(String[] args) {

        int n = 12234;
        int digit = 2;
        int value = 0;

        while (n != 0) {
            int rem = n % 10;

            if (rem != digit) {
                value = value * 10 + rem;
            }

            n = n / 10;
        }

        System.out.println("After removing digit: " + value);
        System.out.println("Correct order: " + Reverse(value));
    }

    private static int Reverse(int value) {

        int rev = 0;

        while (value != 0) {
            int rem = value % 10;
            rev = rev * 10 + rem;
            value = value / 10;
        }

        return rev;
    }
}