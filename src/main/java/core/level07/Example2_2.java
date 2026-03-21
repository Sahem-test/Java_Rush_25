package main.java.core.level07;

public class Example2_2 {
    public static void main(String[] args) {
        //  нужно увеличить каждую оценку на 1
        int[] grades = {3, 4, 2, 5, 1};
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i] + 1;
            System.out.println("Новая оценка + 1 бал к оценке: " + grade);
        }
        System.out.println();
        int[] array = {4, 2, 8, 9, 3, 4, 7, 6, 1, 5};

        //сумма всех элементов массива
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        System.out.println("Сумма всех элементов равна: " + sum);

        // поиск максимального значения
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число массива: " + max);

        //поиск минимального значения
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число массива: " + min);

        //вычисление среднего арифметического
        int sum1 = 0;
        for (int j = 0; j < array.length; j++) {
            sum1 += array[j];
        }
        double avr =(double) sum1/array.length;
        System.out.println("Средне - арифметическое равно: " + avr);
    }


}
