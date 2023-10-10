package _kurs1.lr5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1_Class1 cr = new Task1_Class1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        cr.setSimvol(scanner.nextLine());

        System.out.println();
        System.out.println("Введенный символ: "+cr.getSimvol());
        System.out.println("Код введенного символа: "+cr.getIntSim());
        System.out.println("Введенный символ и его код: "+cr.getAll());

    }
}


//1. Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.