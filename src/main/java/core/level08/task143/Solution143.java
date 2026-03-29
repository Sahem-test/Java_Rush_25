package main.java.core.level08.task143;

public class Solution143 {

    public static int getHigherScore(int playerOneScore, int playerTwoScore){
        if(playerOneScore>playerTwoScore){
            return playerOneScore;
        } else{
            return playerTwoScore;
        }
    }
}
//  можно решить: return Math.max(playerOneScore, playerTwoScore);