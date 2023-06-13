package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������");
        int size = in.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i<size; i++){
            arr[i]=random.nextInt();
        }
        System.out.println("������ arr = ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filter(arr);

        System.out.println("������ arrResult = ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filter(int[] arr) {
        return Arrays.stream(arr).filter(x->x % 2 == 0).toArray();
    }
}

//        1. �������� �������, ������� ��������� �� ���� ������ ����� �����
//        � ���������� ����� ������, ���������� ������ ������ ����� �� ��������� �������.