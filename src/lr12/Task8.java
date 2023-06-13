package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        List<Integer> list = new ArrayList<Integer>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.print("Изначальный список: " + list);
        System.out.println();

        System.out.print("Введите число, с которым нужно сравнивать: ");
        int num = in.nextInt();

        List<Integer> listResult = filter(list, num);

        System.out.println("Результат сравнения: " + listResult);
    }

    public static List<Integer> filter(List<Integer> arr, int num) {
        return arr.stream()
                .filter(x -> x > num)
                .collect(Collectors.toList());
    }
}

//        8. Напишите функцию, которая принимает на вход список целых чисел
//        и возвращает новый список, содержащий только те числа, которые больше заданного значения.