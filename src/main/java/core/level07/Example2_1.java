package main.java.core.level07;

/**
 * Найти сумму всех баллов
 */
public class Example2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int score : scores) {
            sum += score;
        }
            System.out.println("сумма: " + sum);
    }
}
