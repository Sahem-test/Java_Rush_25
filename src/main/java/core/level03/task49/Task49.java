package main.java.core.level03.task49;

/**
 * Представьте, что два спортсмена, Алекс и Майк, соревнуются в скорости.
 * Объявите две переменные типа int: alexsTime и mikesTime. Присвойте им любое время в секундах.
 * Используя тернарный оператор, определите, кто из них быстрее. Сохраните наименьшее время в переменную fastestTime и выведите её на экран.
 * Требования:
 * •	В программе должны быть объявлены две переменные типа int с именами alexsTime и mikesTime.
 * •	Переменным alexsTime и mikesTime должны быть присвоены значения времени (в секундах).
 * •	Для определения минимального значения между alexsTime и mikesTime должен использоваться тернарный оператор (?:).
 * •	Результат работы тернарного оператора (наименьшее время) должен быть сохранён в переменную int с именем fastestTime.
 * •	Значение переменной fastestTime должно быть выведено на экран.
 */
public class Task49 {
    public static void main(String[] args) {
        int alexsTime = 15;
        int mikesTime = 24;
        int fastestTime = alexsTime < mikesTime ? alexsTime : mikesTime;
        System.out.println(fastestTime);

    }
}
