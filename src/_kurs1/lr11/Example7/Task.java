package _kurs1.lr11.Example7;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        String[] strNamesArray = new String[]{"�����", "����", "�������", "���������", "���������", "�����", "���������", "����", "�����", "������", "������"};
        List<String> strNamesColl = Arrays.asList(strNamesArray);      // ������� ������� ��������� �� ������� String
        ArrayList<String> arrList = new ArrayList<>(strNamesColl);     // ��������� ArrayList ���������� �� ������� ���������
        LinkedList<String> lnkList = new LinkedList<>(strNamesColl);   // ��������� LinkedList ���������� �� ������� ���������
        System.out.println("� ArrayList �������: "+process(arrList));
        System.out.println("� LinkedList �������: "+process(lnkList));
    }

    static String process(ArrayList<String> peoples) {
        int count = 0;
        while (peoples.size() > 1) {                                   // ��������� ���� ���� � ��������� �� ��������� ���� �������
            Iterator<String> iter = peoples.iterator();
            while (iter.hasNext()) {
                iter.next();
                count++;
                if (count % 2 == 0) iter.remove();                     // ������� ������ �������� �� ��������� ��� ������ ���������
            }
        }
        return peoples.get(0);                                         // ���������� ���������� ������� � ���������
    }

    static String process(LinkedList<String> peoples) {
        int count = 0;
        while (peoples.size() > 1) {
            Iterator<String> iter = peoples.iterator();
            while (iter.hasNext()) {
                iter.next();
                count++;
                if (count % 2 == 0) iter.remove();
            }
        }
        return peoples.get(0);
    }
}

//        � ����� ����� N �������, ��������������� �� 1 �� N.
//        ��� ������� ����� �� ����� ������������� ������ ������ �������, ���� �� ��������� ����.
//        ��������� ��� ���������, ������������ �������. ���� �� �������� ������ ������������ ����� ArrayList, � ������ � LinkedList.
//        ����� �� ���� �������� �������� �������? ������?