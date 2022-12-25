package lr5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2_Class1 cr = new Task2_Class1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 символ: ");
        cr.setSimvol1(scanner.nextLine());

        System.out.print("Введите 2 символ: ");
        cr.setSimvol2(scanner.nextLine());

        System.out.println();
        System.out.print("Введенный символ и его код: " + cr.getAll());
    }
}


//2. Напишите программу с классом, у которого есть два символьных поля и
//        метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//        выводит в консольное окно все символы из кодовой таблицы, которые
//        находятся «между» символами, являющимися значениями полей объекта (из
//        которого вызывается метод). Например, если полям объекта присвоены
//        значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//        выводиться все символы от ‘A’ до ‘D’ включительно.