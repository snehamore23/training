package Number_Programimg;

public class Armstrong_no {

    public static int power(int n, int power) {
        int res = 1;

        for (int i = 1; i <= power; i++) {
            res *= n;
        }

        return res;
    }

    public static void main(String[] args) {

        int n = 153;
        int original = n;
        int temp = n;
        int sum = 0;
        int countofdig = 0;

        // Count number of digits
        while (temp != 0) {
            countofdig++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        while (n != 0) {
            int rem = n % 10;
            sum = sum + power(rem, countofdig);
            n = n / 10;
        }

        // Check Armstrong number
        if (original == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}