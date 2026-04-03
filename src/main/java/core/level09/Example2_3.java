package main.java.core.level09;

import java.util.Scanner;

/**
 * Пример с консольным вводом
 */
public class Example2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = console.nextLine();

        System.out.print("Введите возраст: ");
        int age = console.nextInt();

        System.out.print("Введите баланс:");
        double balance = console.nextDouble();

        String info = String.format("имя: %s, возраст: %d, баланс: %.2f  евро", name, age, balance);
        System.out.println(info);
    }
}
