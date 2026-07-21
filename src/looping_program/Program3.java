package looping_program;

public class Program3 {

    public static void main(String[] args) {

        System.out.println("------1 to 5-------");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        
        System.out.println("------10 to 1-------");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        
        System.out.println("------Special char-------");
        char ch = '!';
        while (ch <= '/') {
            System.out.println(ch);
            ch++;
        }

        
        System.out.println("------A to Z-------");
        char c = 'A';
        while (c <= 'Z') {
            System.out.print(" " + c);
            c++;
        }
        System.out.println();
        

        System.out.println("------a to z-------");
        c = 'a';
        while (c <= 'z') {
            System.out.print(" " + c);
            c++;
        }
        System.out.println();

        
        System.out.println("------sum of 1 to 10-------");
        int sum = 0;
        i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        
        System.out.println("------product of no 1 to 5-------");
        int product = 1;
        i = 1;
        while (i <= 5) {
            product *= i;
            i++;
        }
        System.out.println(product);

        
        System.out.println("------divisible by 3 between 10 and 60-------");
        i = 10;
        while (i <= 60) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        

        System.out.println("------divisible by 2 and 5 between 30 and 100-------");
        i = 30;
        while (i <= 100) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

        
        System.out.println("------1 to 20 even no-------");
        i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        
        System.out.println("------1 to 100 even no-------");
        i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        
        System.out.println("------1 to 20 odd no-------");
        i = 1;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        
        System.out.println("------1 to 100 odd no-------");
        i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        
        System.out.println("------table from 1 to 3-------");
        i = 1;
        while (i <= 3) {
            System.out.println("Table of " + i);

            j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }

            System.out.println();
            i++;
        }

        
        System.out.println("------Product of numbers divisible by 2 between 1 and 10-------");
        int pro = 1;
        i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                pro *= i;
            }
            i++;
        }
        
        
        System.out.println("Product = " + pro);

        System.out.println("------Table of 2-------");
        i = 1;
        while (i <= 10) {
            System.out.println("2 * " + i + " = " + (2 * i));
            i++;
        }
    }
}