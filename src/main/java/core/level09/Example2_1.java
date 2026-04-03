package main.java.core.level09;

/**
 * Создать короткий отчет
 */
public class Example2_1 {
    public static void main(String[] args) {
        String name = "Анна";
        int task = 5;
        double hours = 12.3456;

        String report = String.format(
                "Сотрудник %s%nВыполнено задач: %d%nПотрачено часов: %.2f",
                name, task, hours
        );
        System.out.println(report);
    }
}
