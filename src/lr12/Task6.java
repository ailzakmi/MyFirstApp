package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �������: ");
        int size = in.nextInt();

        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.print("����������� ������: " + list);

        System.out.print("\n������� �����, �� ������� ����� ������: ");
        int del = in.nextInt();

        List<Integer> result = filter(list, del);

        System.out.print("���������� �������: " + result);
    }

    public static List<Integer> filter(List<Integer> arr, int del) {
        return arr.stream()
                .filter(x -> x % del == 0)
                .collect(Collectors.toList());

    }
}

//        6. �������� �������, ������� ��������� �� ���� ������ ����� �����
//        � ���������� ����� ������, ���������� ������ �� �����,
//        ������� ������� �� �������� ����� ��� �������.