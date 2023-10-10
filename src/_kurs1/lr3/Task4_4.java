package _kurs1.lr3;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {

        Scanner in = new  Scanner(System.in);
        int a = 1, b = 1;
        System.out.print("Введите первое число: ");
        int k = in.nextInt();
        System.out.print("Введите второе число: ");
        int d = in.nextInt();

        if (k<d) {
            a = k;
            b = d;
        } else if (k>d) {
            a = d;
            b = k;
        } else if (k==d) {
            System.out.println("Введите разные числа.");
            return;
        } else {
            System.out.println("Вы ввели неверные числа.");
            return;
        }

        System.out.print(a);
        while (true) {
            a++;
            System.out.print(", " + a);
            if (a == b) {
                break;
            }
        }
    }
}



//    Напишите программу, в которой пользователем вводится два
//    целых числа. Программа выводит все целые числа — начиная с наименьшего
//    (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//    чисел). Предложите разные версии программы (с использованием разных
//    операторов цикла).