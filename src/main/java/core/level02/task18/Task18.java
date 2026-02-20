package main.java.core.level02.task18;

/**
 * Вы создаете профиль для пользователя. Создайте две переменные типа String: firstName со значением "Luke" и lastName со значением "Skywalker".
 * Объедините их в одну строку, добавив пробел между именем и фамилией, и выведите результат на экран.
 * Требования:
 * •	В программе должны быть объявлены две переменные типа String: firstName и lastName.
 * •	Переменной firstName должно быть присвоено значение "Luke", а переменной lastName — значение "Skywalker".
 * •	Переменные firstName и lastName должны быть объединены в одну строку с пробелом между ними.
 * •	Результирующая строка с полным именем должна быть выведена на экран.
 */
public class Task18 {
    public static void main(String[] args) {

        String firstName = "Luke";
        String lastName = "Skywalker";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    }
}
