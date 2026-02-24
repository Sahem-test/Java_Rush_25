package main.java.core.level03.task44;

/**
 * Вы создаёте умный термостат. Объявите переменную int с именем roomTemperature.
 * Создайте переменную типа boolean с именем isComfortable, которая станет true, если roomTemperature находится в комфортном диапазоне от 20 до 25 градусов включительно.
 * Выведите значение isComfortable на экран.
 * Требования:
 * •	В программе должна быть объявлена переменная типа int с именем roomTemperature.
 * •	В программе должна быть объявлена переменная типа boolean с именем isComfortable.
 * •	Переменная isComfortable должна быть равна true, если значение roomTemperature находится в диапазоне от 20 до 25 включительно.
 * •	Программа должна выводить значение переменной isComfortable на экран.
 */
public class Task44 {
    public static void main(String[] args) {
        int roomTemperature = 26;
        boolean isComfortable = (roomTemperature >= 20) && (roomTemperature <= 25);
        System.out.println("isComfortable: " + isComfortable);

    }
}
