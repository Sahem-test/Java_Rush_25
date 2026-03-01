package main.java.core.level04;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String command;
        do {
            System.out.println("Меню: ");
            System.out.println("1. Приветствие.");
            System.out.println("2. Выйти из программы");
            System.out.println("Выберите действие: ");
            command = console.nextLine();
            if (command.equals("1")) {
                System.out.println("Привет Мир!");
            } else if (!(command.equals("2")))
            {
                System.out.println("Выход из программы");
            }
        } while (!(command.equals("2")));
        System.out.println("Пока!");
    }
}
