package _kurs1.lr3;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int i = 0, rom = 0;
        System.out.print("Введите размер масива: ");

        int k = in.nextInt();
        if (k <= 0) {
            System.out.println("Введено некоректное значение!");
            return;
        }
        int[] arr = new int[k];

        while (i != k) {
            rom = random.nextInt(200);
            if ((rom%5) == 2) {
                arr[i] = rom;
                System.out.println("Элемент массива ["+i+"] = " + arr[i]);
                i++;
            }

        }
    }
}


//    Напишите программу, в которой создается одномерный числовой массив
//    и заполняется числами, которые при делении на 5 дают в остатке 2
//    (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//    Предусмотреть обработку ошибки, связанной с вводом некорректного значения.