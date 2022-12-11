package lr3;

import java.util.Scanner;
import java.util.Random;

public class Task5_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0, i = 0, result = 0;
        Random random = new Random();
        System.out.print("Введите количество ссумирующихся чисел: ");
        int k = in.nextInt();

        for (;i != k;) {
            a = random.nextInt(200);
            if (((a%5)==2) | ((a%3) == 1)) {
                i++;
                result+=a;
                if (i == 1) {
                    System.out.print(a);
                } else {
                    System.out.print(" + " + a);
                }
            }
        }

        if (i == k) {
            System.out.print(" = " + result);
        } else {
            System.out.print("Ошибка!");
        }
    }
}




//    Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
//    При делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
//    Количество чисел в сумме вводится пользователем.
//    Программа отображает числа, которые суммируются, и значение суммы.
//    Предложите версии программы, использующие разные операторы цикла