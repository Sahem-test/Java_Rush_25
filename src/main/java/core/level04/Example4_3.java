package main.java.core.level04;

import java.util.Scanner;

/**
 * Пропуск четных чисел + ввод с консоли с проверкой числа.
 */
public class Example4_3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            if (console.hasNextInt()) {
                int number = console.nextInt();
                for (int i = 0; i < number; i++) {
                    if (i % 2 == 0) {
                        continue;
                    } else {
                        System.out.println("Число состоит из нечетных чисел: " + i);
                    }
                }
            } else {
                System.out.println("Это не число!");
                break;
            }
        }
    }
}



