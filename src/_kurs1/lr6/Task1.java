package _kurs1.lr6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1_Class1 cr = new Task1_Class1();
        Scanner scanner = new Scanner(System.in);

        String Set;
        char[] Set2;
        System.out.print("Введите число: ");
        Set = scanner.nextLine();

        if (Set.length() == 1) {
            Set2 = Set.toCharArray();
            cr.set(Set2[0]);
        } else {
            cr.set(Set);
        }

        System.out.println();
        System.out.print(cr.get());
    }
}


//1. Напишите программу с классом, в котором есть два ноля: символьное и текстовое.
//        В классе должен быть перегруженный метод для присваивания значений нолям. Если метод
//        вызывается с символьным аргументом, то соответствующее значение присваивается
//        символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//        значение текстового ноля. Методу аргументом также может передаваться символьный
//        массив. Если массив состоит из одного элемента, то он определяет значение символьного
//        поля. В противном случае (если в массиве больше одного элемента) из символов массива
//        формируется текстовая строка и присваивается значением текстовому полю.