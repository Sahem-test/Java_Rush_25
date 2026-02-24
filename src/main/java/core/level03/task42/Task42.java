package main.java.core.level03.task42;

/**
 * Представьте, что вы записываете результат футбольного матча. Объявите две переменные типа int с любыми значениями, например, ourScore и opponentScore.
 * Создайте переменную типа boolean с именем weWon, которая будет содержать результат сравнения: наш счёт больше счёта соперника.
 * Выведите значение переменной weWon на экран.
 * Требования:
 * •	В программе должны быть объявлены две переменные типа int, например, ourScore и opponentScore.
 * •	Переменным ourScore и opponentScore должны быть присвоены любые целочисленные значения.
 * •	В программе должна быть объявлена переменная типа boolean с именем weWon.
 * •	Переменная weWon должна содержать результат сравнения: значение true, если ourScore больше opponentScore, иначе false.
 * •	Программа должна вывести на экран значение переменной weWon.
 */
public class Task42 {
    public static void main(String[] args) {
        int ourScore = 3;
        int opponentScore = 4;
        boolean weWon = ourScore > opponentScore;
        System.out.println(weWon);

        }
    }

