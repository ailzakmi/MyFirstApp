package lr5;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3_Class1 cr = new Task3_Class1();
        Scanner scanner = new Scanner(System.in);

        String notNull,notNull2 = "";
        System.out.print("Введите 1 чило или оставьте пустым для рандомного числа: ");
        notNull = scanner.nextLine();
        System.out.print("Введите 2 чило или оставьте пустым: ");
        notNull2 = scanner.nextLine();
        if (Objects.equals(notNull, "")) {
            cr.setRandom();
        } else if (Objects.equals(notNull2, "")){
            cr.setSimvol(notNull);
        } else {
            cr.setSimvol(notNull, notNull2);
        }

        System.out.println();
        System.out.print("Введенный символ и его код: " + cr.getAll());
    }
}


//3. Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с передачей одного аргумента и с передачей
//        двух аргументов.