package looping_program;

public class Program2 {

    public static void main(String[] args) {

        System.out.println("------1 to 5-------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("------10 to 1-------");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        System.out.println("------Special char-------");
        for (char ch = '!'; ch <= '/'; ch++) {
            System.out.println(ch);
        }

        System.out.println("------A to Z-------");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(" " + c);
        }
        System.out.println();

        System.out.println("------a to z-------");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(" " + c);
        }
        System.out.println();

        System.out.println("------sum of 1 to 10-------");
        int sum = 0;
        for (int c = 1; c <= 10; c++) {
            sum += c;
        }
        System.out.println(sum);

        System.out.println("------product of no 1 to 5-------");
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println(product);

        System.out.println("------divisible by 3 between 10 and 60-------");
        for (int i = 10; i <= 60; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------divisible by 2 and 5 between 30 and 100-------");
        for (int i = 30; i <= 100; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------1 to 20 even no-------");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------1 to 100 even no-------");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------1 to 20 odd no-------");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("------1 to 100 odd no-------");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("------table from 1 to 3-------");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }

        System.out.println("------Product of numbers divisible by 2 between 1 and 10-------");
        int pro = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                pro *= i;
            }
        }

        System.out.println("Product = " + pro);

        System.out.println("------Table of 2-------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}