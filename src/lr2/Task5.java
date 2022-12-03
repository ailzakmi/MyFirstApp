package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную: ");

        int x = in.nextInt();

        if (x < 0) {    //Перевод отрицательного числа в положительное
            x*=-1;      //Замена
        }

        x /= 1000;
        //x=+x; //Не работает

        if (x > 0) {
            System.out.println("В переменной " + x + " тысяч");
        } else {
            System.out.println("Переменная меньше тысячи");
        }

    }
}
