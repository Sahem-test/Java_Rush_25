package main.java.core.level01.task08;

/**
 * Вы создаете профиль пользователя в социальной сети. Объявите переменную типа String с именем userName и присвойте ей значение "Alice". Также, объявите переменную типа int с именем userAge со значением 20.
 * Затем, создайте переменную profileInfo типа String, в которую вы объедините имя и возраст в строку "Имя: Alice, Возраст: 20". Выведите значение profileInfo на экран.
 * Требования:
 * •	В программе должна быть объявлена переменная типа String с именем userName.
 * •	Переменной userName должно быть присвоено значение "Alice".
 * •	В программе должна быть объявлена переменная типа int с именем userAge.
 * •	Переменной userAge должно быть присвоено значение 20.
 * •	В программе должна быть объявлена переменная типа String с именем profileInfo, в которую объединяются имя и возраст пользователя в виде строки "Имя: Alice, Возраст: 20".
 */
public class Task08 {
    public static void main(String[] args) {
        String userName = "Alice";
        int userAge = 20;
        String profileInfo = "Имя: " + userName + ", " + "Возраст: "+ userAge;
        System.out.println(profileInfo);
    }
}
