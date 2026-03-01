package main.java.core.level04;

/**
 * проверка числа на простоту
 * Число является простым, если оно делится только на 1 и на себя.
 * Нам нужно проверить число на простоту: перебрать все потенциальные делители от 2 до n-1.
 * Если выяснилось, что наше число делится на делитель, то дальше проверять не нужно — число не простое! Можно заканчивать цикл.
 */
public class Example4_1 {
    public static void main(String[] args) {
        int number = 111;
        boolean found = false;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                found = true;
                System.out.println("Нашли делитель  " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Делитель не найден - число простое.");
        }
    }
}
