package Arrays2D;

import java.util.Scanner;

public class User_ip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        System.out.println("Enter elements:");

        // User input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Display matrix
        System.out.println("Matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}