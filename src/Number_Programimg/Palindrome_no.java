package Number_Programimg;


public class Palindrome_no {

    public static void main(String[] args) {

        int n = 121;
        int original = n;
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
