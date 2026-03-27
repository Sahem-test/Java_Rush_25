package main.java.core.level08.task136;

public class MessageAmplifier {

    public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
            String str = "";
        for (int i = 0; i < numberOfRepeats; i++) {
            str +=messageText;
            //Можно решить используя метод concat(), который склейвает строки
            //str=str.concat(messageText);
        }
            System.out.print(str);

    }
}
