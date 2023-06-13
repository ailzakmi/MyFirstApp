package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String string = "���� ��� 20 ��� � 1 ���� ����������. ����� ����������� ����������, ����������, ����� � ����, ��� ����, ��������� ���� �������� ���� ���������, ������ � �����, � ������ � ����� �����. ��������� ��� ����� � ����� ����������. ����� ��, ������� �����. ����� �� ������ �� ��������, ����� � 30 �� ��������� ����������.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("������ ����� ����������: ");
        for(String a : strings){
            System.out.println(a);
        }

        List<String> strP = filter(strings);

        System.out.println("\n������ ����� ����������: ");
        for(String s : strP){
            System.out.println(s);
        }
    }

    public static List<String> filter(List<String> strings){
        return strings.stream().filter(a -> a.matches("[�-��-߸�]+")).collect(Collectors.toList());
    }
}

//        9. �������� �������, ������� ��������� �� ���� ������ �����
//        � ���������� ����� ������, ���������� ������ �� ������,
//        ������� �������� ������ ����� (��� ���� � ��������).