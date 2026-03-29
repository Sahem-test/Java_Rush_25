package main.java.core.level08.task144;

public class Solution144 {
    public static int calculateTotalGrades(int[] studentExamResults) {
        int sum = 0;
        for (int number : studentExamResults) {
            sum += number;
        }
        return sum;
    }
}
