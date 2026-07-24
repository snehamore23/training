package Static_And_non_static;

public class Accesing_members {

    int a = 10;
    static int b = 20;

    // Static Method
    public static void m1() {
        System.out.println("Static Variable b = " + b);

        m11();

        Accesing_members obj1 = new Accesing_members();
        System.out.println("Non-static Variable a = " + obj1.a);

        obj1.m2();
    }

    // Static Method
    public static void m11() {
        System.out.println("Inside Static Method m11()");
    }

    // Non-static Method
    public void m2() {
        System.out.println("Inside Non-static Method m2()");
        System.out.println("a = " + a);
    }

    // Constructor
    public Accesing_members() {
        m22();
    }

    // Non-static Method
    public void m22() {
        System.out.println("Inside Non-static Method m22()");
    }

    public static void main(String[] args) {

        Accesing_members obj1 = new Accesing_members();

        m1();          // Static method
        m11();         // Static method

        obj1.m2();     // Non-static method
        obj1.m22();    // Non-static method
    }
}