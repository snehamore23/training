package Collection;

import java.util.TreeMap;

public class Student1 implements Comparable<Student1> {

    int age;
    String name;
    double marks;
    int rollno;

    @Override
    public int compareTo(Student1 o) {
        return this.age - o.age;
    }

    public Student1(int age, String name, double marks, int rollno) {
        super();
        this.age = age;
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student1 [age=" + age + ", name=" + name +
               ", marks=" + marks + ", rollno=" + rollno + "]";
    }

    public static void main(String[] args) {

        TreeMap<Student1, String> tm =
                new TreeMap<Student1, String>();

        tm.put(new Student1(29, "ram", 90.0, 1), "present");
        tm.put(new Student1(20, "sham", 80.0, 1), "present");
        tm.put(new Student1(21, "siya", 76.0, 1), "present");
        tm.put(new Student1(30, "jiya", 98.5, 1), "present");
        tm.put(new Student1(24, "piya", 93.5, 1), "present");
        tm.put(new Student1(22, "tina", 90.8, 1), "present");

        System.out.println(tm);
    }
}