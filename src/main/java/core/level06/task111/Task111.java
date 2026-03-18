package main.java.core.level06.task111;

/**
 * Расчёт среднего балла по смешанным предметам 🎓
 * Вы — студент, который пытается рассчитать свой средний балл по курсу, где оценки выставляются в разных форматах.
 * За контрольную quizScore вы получили 4 балла (целое число), а за проект projectScore — 2.7 балла (дробное, с учётом мелких недочётов).
 * Объявите одну переменную типа int (для quizScore) и другую типа double (для projectScore).
 * Ваша первая задача — сложить их и получить максимально точный средний балл. Сохраните этот результат в переменной типа double с именем exactCourseAverage.
 * Ваша вторая задача — представить этот средний балл как целое число, отбросив дробную часть (например, для отчёта деканату, который не любит дробные оценки).
 * Явно преобразуйте exactCourseAverage к типу int и сохраните в roundedCourseAverage.
 * В конце выведите оба значения — exactCourseAverage и roundedCourseAverage — на экран, чтобы увидеть разницу и понять, как Java обрабатывает смешанные типы.
 * Требования:
 * •	В программе должны быть объявлены две переменные: одна типа int с именем quizScore, и одна типа double с именем projectScore.
 * •	Переменная quizScore должна быть инициализирована значением 4, а переменная projectScore — значением 2.7.
 * •	Для вычисления точного среднего балла необходимо сложить quizScore и projectScore, а затем разделить сумму на 2. Результат должен быть сохранён в переменной типа double с именем exactCourseAverage.
 * •	Значение переменной exactCourseAverage должно быть явно приведено к типу int и сохранено в переменной с именем roundedCourseAverage.
 * •	Программа должна вывести на экран значения переменных exactCourseAverage и roundedCourseAverage, чтобы показать разницу между точным и округлённым результатом.
 */
public class Task111 {
    public static void main(String[] args) {
        int quizScore = 4;
        double projectScore = 2.7;
        double exactCourseAverage = (quizScore + projectScore) / 2;
        int roundedCourseAverage = (int) exactCourseAverage;
        System.out.println(exactCourseAverage);
        System.out.println(roundedCourseAverage);
    }
}
