package _kurs1.lr11.Example2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��� �������������� � �������� ������� ���������: ");
        int numb = in.nextInt();

        if (numb == 0){
            System.out.println("0");
        }else {
            System.out.println(conversion(numb));
        }
    }
    public static String conversion(int number){
        if (number == 0){
            return "";
        }
        return conversion(number/2) + (number % 2);
    }
}

//    2. ������� ���������� � �������������� �������� ��� ��������
//    ������ �����, ���������� � ����������, � �������� ������� ���������.
