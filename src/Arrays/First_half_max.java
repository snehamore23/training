package Arrays;

public class First_half_max {

    public static void main(String[] args) {

        int b[] = {1, 2, 8, 6, 0, 10, 12};

        int max = b[0];

        for(int i = 0; i < b.length / 2; i++) {
            if(b[i] > max) {
                max = b[i];
            }
        }

        System.out.println("Maximum: " + max);
    }
}