package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        String string = "������ ������������ � ������ ������ �, ���������� ���-�� � �����, ����� ����, ���������, �������� � ��-���� � ��������. ���� �� ��� ����� � ����� ��������� � �� ��������. �� ���� ������� ����� � �� ��������� ������ ���������, ����� ����������� ������ � �����. �� ������� �������� �� �������� � �����: ������ ���� ���������, ����� �������, ������� � � � ��� ����� � ����� � ������� ���� ������� ���� � ��������.";
        List<String> strings = List.of(string.split(","));
        System.out.println("������ ����� ����������: ");
        for(String s : strings){
            System.out.println(s);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ������: ");
        int length = in.nextInt();

        List<String> strP = filter(strings, length);

        System.out.println("\n������ ����� ����������:");
        for(String s : strP){
            System.out.println(s);
        }


    }

    public static List<String> filter(List<String> strings, int length){
        return strings.stream().filter(s -> s.length() > length).collect(Collectors.toList());
        //return strings.stream().filter(s -> s.length() > length).toList();
    }
}

//        7. �������� �������, ������� ��������� �� ���� ������ �����
//        � ���������� ����� ������, ���������� ������ �� ������,
//        ������� ����� ����� ������ ��������� ��������.