package _kurs1.lr4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Task8_9 {
    public static void main(String[] args) {

//        int k = 0, j = 10;
        Scanner in = new Scanner(System.in);
//        String letters = "abcdefghijklmnopqrstuvwxyz";
//        char[] sym = new char[letters.length()];
//        char[] arr = new char[j];
        String yes;

        System.out.print("Введите фразу для шифра: ");
        String value = in.nextLine();

        System.out.print("Введите ключ для шифра: ");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("Фраза до преобразования" + Arrays.toString(chars));

        for (int i = 0;i < chars.length;i++) {
            ints[i] = chars[i] + key;
            chars[i] = (char) ints[i];
        }

//        System.out.println("ints после преобразования" + Arrays.toString(ints));
        System.out.println("Фраза после преобразования" + Arrays.toString(chars));

        do {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            yes = in.nextLine();
            if ((Objects.equals(yes, "y")) || (Objects.equals(yes, "n"))) {
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        } while (true);

        if (yes.equals("y")) {
            for (int i = 0; i < chars.length; i++) {
                ints[i] = chars[i] - key;
                chars[i] = (char) ints[i];
            }

            System.out.println("ints после 2-го преобразования" + Arrays.toString(ints));
            System.out.println("chars после 2-го преобразования" + Arrays.toString(chars));
        } else {
            System.out.println("До свидания");
        }
    }
}


// (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
//         необходимо реализовать собственный алфавит, остальные условия идентичны
//         задаче 8.

//    Напишите программу «Шифр Цезаря», которая зашифровывает
//        введенный текст. Используете кодовую таблицу символов. При запуске
//        программы в консоль необходимо вывести сообщение: «Введите текст для
//        шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//        После того как введены все данные, необходимо вывести преобразованную
//        строку с сообщением «Текст после преобразования : ». Далее необходимо
//        задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//        если пользователь вводит «y», тогда выполнить обратное преобразование.
//        Если пользователь вводит «n», того программа выводит сообщение «До
//        свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//        то программа ему выводит сообщение: «Введите корректный ответ».