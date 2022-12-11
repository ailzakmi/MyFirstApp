package lr3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        String day = in.next();

        switch (day) {

            case "1" :
                System.out.println("Понедельник");
                break;
            case "2" :
                System.out.println("Вторник");
                break;
            case "3" :
                System.out.println("Среда");
                break;
            case "4" :
                System.out.println("Четверг");
                break;
            case "5" :
                System.out.println("Пятница");
                break;
            case "6" :
                System.out.println("Субота");
                break;
            case "7" :
                System.out.println("Воскресенье");
                break;
            default:
            System.out.println("Введены некоректные данные.");
        }

    }
}
