package main.java.core.level01.task07;

/**
 * Представьте, что вы ведете счет в игре. Объявите две переменные типа int: player1Score со значением 1999 и player2Score со значением 25.
 * Создайте переменную totalScore, в которую запишите общую сумму очков обоих игроков, и выведите её на экран.
 * Требования:
 * •	В программе должны быть объявлены две переменные типа int: player1Score и player2Score.
 * •	Переменная player1Score должна быть инициализирована значением 1999, а переменная player2Score — значением 25.
 * •	В программе должна быть объявлена переменная totalScore, в которую записывается сумма значений player1Score и player2Score.
 * •	Значение переменной totalScore должно быть выведено на экран.
 */
public class Task07 {
    public static void main(String[] args) {
        int player1Score = 1999;
        int player2Score = 25;
        int totalScore = player1Score + player2Score;
        System.out.println(totalScore);
    }
}
