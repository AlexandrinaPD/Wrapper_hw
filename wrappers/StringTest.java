package wrappers;

import java.util.Scanner;

public class StringTest {


    public static void main(String[] args) {

        // 2.1 - 2.5

        String str1 = "qwerty";
        String str2 = new String("qwerty");
        char symbol[] = {'q', 'w', 'e', 'r', 't', 'y'};
        String str3 = new String(symbol);
        String str4 = "qwerty";
        String str5 = new String(str4.getBytes());
        StringBuilder builder = new StringBuilder("qwerty");
        String str6 = builder.toString();

        // 3.1 - 3.12

        String stroka = "Яблоко,Апельсин,Гранат,Груша";
        String fruits[] = stroka.split(",");
        int maxLength = 0;
        String maxLengthWord = null;
        for (String fruit : fruits) {
            System.out.println(fruit);
            if (fruit.length() > maxLength) {
                maxLength = fruit.length();
                maxLengthWord = fruit;
            }

        }
        System.out.println(maxLengthWord.toLowerCase());


        String stroka2 = "   Я_новая_строка      ";
        stroka2 = stroka2.trim().replace('_', ' ');
        System.out.println(stroka2);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Вы ввели:" + text);
        if (text.equals("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (text.equals("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (text.equalsIgnoreCase("ошибка")) {
            System.out.println("Процесс завершен");
        }

        // 4.1 - 4.4

        StringBuilder builder1 = new StringBuilder();
        builder1.append(str1)
                .append(str2)
                .append(str3)
                .append("\n")
                .append(str4)
                .append(str5)
                .append(str6)
                .append("\n")
                .append(stroka)
                .append(stroka2)
                .reverse();
        System.out.println(builder1);


    }
}
