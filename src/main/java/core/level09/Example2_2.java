package main.java.core.level09;

/**
 * Таблица с выравниванием
 */
public class Example2_2 {
    public static void main(String[] args) {
        String header = String.format("%-10s | %5s | %8s, ","Имя","Баллы","Часы");
        String row1 = String.format("%-10s | %5d | %8.2f, ","Олег", 95, 10.5);
        String row2 = String.format("%-10s | %5d | %8.2f, ","Анна", 100, 9.75);
        System.out.println(header);
        System.out.println(row1);
        System.out.println(row2);
    }

}
