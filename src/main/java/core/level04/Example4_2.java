package main.java.core.level04;

import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Введите сой возраст: ");

            if (console.hasNextInt())
            {
                int age = console.nextInt();
                if (age > 0) {
                    System.out.println("Отлично! Ваш возраст: " + age);
                    break; // данные корректные — выходим
                } else
                {
                    System.out.println("Ошибка! Введите положительный возраст.");
                }
            } else
            {
                System.out.println("Ошибка! Введите число.");
                console.nextLine(); // съедаем некорректный ввод
            }
        }
    }
}



