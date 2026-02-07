package main.java.core.level01.task09;

/**
 * Вы рассчитываете стоимость заказа в магазине. Объявите три переменные типа int: itemPrice со значением 4, itemCount со значением 3, discount со значением 2.
 * Создайте переменную totalCost, в которую запишите значение выражения itemPrice * itemCount - discount.
 * После этого создайте переменную finalMessage типа String, в которую вы запишете строку "Итоговая стоимость: " + totalCost, и выведите её на экран.
 * Требования:
 * •	В программе должны быть объявлены три переменные типа int: itemPrice, itemCount и discount.
 * •	Переменным itemPrice, itemCount и discount должны быть присвоены значения 4, 3 и 2 соответственно.
 * •	Должна быть объявлена переменная totalCost, в которую записывается результат выражения itemPrice * itemCount - discount.
 * •	Должна быть объявлена переменная finalMessage типа String.
 * •	В переменную finalMessage должна быть записана строка "Итоговая стоимость: " + totalCost.
 * •	Программа должна вывести на экран содержимое переменной finalMessage.
 */
public class Task09 {
    public static void main(String[] args) {
    int itemPrice = 4;
    int itemCount = 3;
    int discount = 2;
    int totalCost = itemPrice * itemCount - discount;
    String finalMessage = "Итоговая стоимость: " + totalCost;
        System.out.println(finalMessage);
    }
}
