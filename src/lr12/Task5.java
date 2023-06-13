package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args){
        String string = "ظ� 1900 ���, ��-�� ���� ������� ����� ���������� ���� ������� �� ����������� �������-��������. � ������ � �� ������ ��������, � ���������� ������ ��������� �������� �, ����� �������, ������������.";

        List<String> strings = List.of(string.split(","));
        System.out.println("������ ����� ����������: ");
        for(String a : strings){
            System.out.println(a);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���������: ");
        String subString = in.nextLine();

        List<String> stringAfter = filterString(strings, subString);

        System.out.println("\n������ ����� ����������: ");
        for(String a : stringAfter){
            System.out.println(a);
        }
    }

    public static List<String> filterString(List<String> strings, String subString){
        return strings.stream().filter(s -> s.contains(subString)).collect(Collectors.toList());
    }
}

//        5. �������� �������, ������� ��������� �� ���� ������ �����
//        � ���������� ����� ������, ���������� ������ �� ������, ������� �������� �������� ���������.