package main.java.core.level03.task43;

/**
 * Вы с друзьями планируете пикник на выходных. Задайте две переменные типа boolean: isSunny и isWeekend.
 * Создайте переменную canGoToPark, которая будет true только если и isSunny, и isWeekend равны true (используйте оператор &&).
 * Создайте вторую переменную canStayHome, которая будет true, если хотя бы один из дней не соответствует условиям для пикника (используйте оператор || и !).
 * Выведите значения обеих новых переменных на экран.
 * Требования:
 * •	В программе должны быть объявлены две переменные типа boolean: isSunny и isWeekend.
 * •	Переменная canGoToPark должна быть объявлена и вычисляться с помощью логического оператора &&, чтобы принимать значение true только если isSunny и isWeekend оба равны true.
 * •	Переменная canStayHome должна быть объявлена и вычисляться с помощью логических операторов || и !, чтобы принимать значение true, если хотя бы одно из условий (не солнечно или не выходные) выполняется.
 * •	Значения переменных canGoToPark и canStayHome должны быть выведены на экран.
 */
public class Task43 {
    public static void main(String[] args) {
    boolean isSunny = true;
    boolean isWeekend = true;
        boolean canGoToPark = isSunny && isWeekend;
        boolean canStayHome = (!isSunny) || (!isWeekend) ;
        System.out.println("canGoToPark = " + canGoToPark);
        System.out.println("canStayHome = " + canStayHome);

    }

    }

