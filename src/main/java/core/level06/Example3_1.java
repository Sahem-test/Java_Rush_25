package main.java.core.level06;

public class Example3_1 {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;
        double epsilon = 0.000001;
        if (Math.abs(a - b) < epsilon) {
            System.out.println("Почти равно!");
        }

    }
}
