package main.java.core.level06;

/**
 * Приведение типа с округлением
 */
public class Example4_2 {
    public static void main(String[] args) {
        double number = 8.78;
        int rounded = (int) Math.round(number);
        System.out.println(rounded);
    }
}
