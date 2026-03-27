package main.java.core.level08.task135;

public class GameScore {
    private static int totalGameScore =0;

    public static void collectCoin(){
        totalGameScore++;
    }

    public static void displayCurrentScore(){
        System.out.println(totalGameScore);
    }
}
