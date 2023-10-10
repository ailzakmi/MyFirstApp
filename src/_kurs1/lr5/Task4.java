package _kurs1.lr5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4_Class1 cr = new Task4_Class1();
        Scanner scanner = new Scanner(System.in);

        double charSet;
        String charSim;
        System.out.print("Введите число: ");
        charSet = scanner.nextDouble();

        if ((charSet % 1) == 0) {
            System.out.print("Введите код символа: ");
            charSim = scanner.next();
            cr.setSimvol(charSet,charSim);
        } else {
            cr.setSimvol(charSet);
        }

        System.out.println();
        System.out.print("Введенный символ и число: " + cr.getAll());
    }
}


//4. Напишите программу с классом, у которого есть символьное и
//        целочисленное поле. В классе должны быть описаны версии конструктора с
//        двумя аргументами (целое число и символ – определяют значения полей), а
//        также с одним аргументом типа double. В последнем случае действительная
//        часть аргумента определяет код символа (значение символьного поля), а
//        дробная часть (с учетом десятых и сотых) определяет значение
//        целочисленного поля. Например, если аргументом передается число 65.1267,
//        то значением символьного поля будет символ ‘A’ с кодом 65, а целочисленное
//        поле получит значение 12 (в дробной части учитываются только десятые и
//        сотые).