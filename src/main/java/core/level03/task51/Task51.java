package main.java.core.level03.task51;

/**
 * Ваше приложение должно приветствовать пользователя по-разному в зависимости от времени суток.
 * Объявите переменную int currentHour, которая хранит текущий час (от 0 до 23).
 * С помощью тернарного оператора присвойте строковой переменной greetingMessage значение "Доброе утро", если currentHour меньше 12, иначе "Добрый день".
 * Выведите greetingMessage на экран.
 * Требования:
 * •	В программе должна быть объявлена переменная int с именем currentHour, хранящая значение текущего часа (от 0 до 23).
 * •	Строковой переменной greetingMessage должно присваиваться значение с помощью тернарного оператора.
 * •	Если значение currentHour меньше 12, greetingMessage должно быть равно "Доброе утро", иначе "Добрый день".
 * •	Программа должна вывести значение переменной greetingMessage на экран.
 */
public class Task51 {
    public static void main(String[] args) {
        int currentHour = 10;
        String greetingMessage = (currentHour < 12) ? "Доброе утро" : "Добрый день";
        System.out.println(greetingMessage);
    }
}
