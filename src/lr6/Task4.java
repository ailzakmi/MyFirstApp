package lr6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4_Class1 cr = new Task4_Class1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        cr.setN(scanner.nextInt());


        System.out.println();
        System.out.print("Двойной факториал равен: " + cr.get());
    }
}


//4. Напишите программу, в которой описан статический метод для вычисления
//        двойного факториала числа, переданного аргументом методу. По определению, двойной
//        факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//        больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//        нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
//        Предложите версию метода без рекурсии и с рекурсией.
