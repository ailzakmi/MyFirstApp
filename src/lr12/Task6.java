package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.print("Изначальный список: " + list);

        System.out.print("\nВведите число, на которое нужно делить: ");
        int del = in.nextInt();

        List<Integer> result = filter(list, del);

        System.out.print("Реззультат деления: " + result);
    }

    public static List<Integer> filter(List<Integer> arr, int del) {
        return arr.stream()
                .filter(x -> x % del == 0)
                .collect(Collectors.toList());

    }
}

//        6. Напишите функцию, которая принимает на вход список целых чисел
//        и возвращает новый список, содержащий только те числа,
//        которые делятся на заданное число без остатка.