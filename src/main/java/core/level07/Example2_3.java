package main.java.core.level07;

import java.util.Scanner;

/**
 * Ввод массива с клавиатуры
 */
public class Example2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 5;
        int[] array = new int[n];
        System.out.print("Введите " + n + " чисел: ");
        for (int i = 0; i < 5; i++) {
            array[i] = console.nextInt();
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // вывод массива в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
