package _kurs2.Arhivator;

import java.util.ArrayList;

public class LWZ_M {
    public static void main(String[] args) {
        String fraza = "�������� ������� � ���� � ����� (Lempel-Ziv-Welch, LZW) � ��� ������������� �������� ������ ������ ��� ������, ��������� �������� ��������, ������� ����� � ����� ������. �� ��� ����������� ������ � 1984 ���� � �������� ���������� ���������� ��������� LZ78, ��������������� �������� � ����� � 1978 ����. �������� ���������� ���, ����� ��� ���� ���������� ������ ����������� ��� ����������, ��� � ���������.";
        String obrabotka = "";
        String str = "";
        char ch = 0;
        int i = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        while (i != fraza.length()) {
            ch = fraza.charAt(i);
            if (prov(arrayList, str+ch)) {
                str = str + ch;
            } else {
                arrayList.add(str + ch);
                obrabotka = obrabotka + arrayList.indexOf(str + ch) + ", ";
                str = String.valueOf(ch);
            }
            i += 1;
        }
//        obrabotka = obrabotka + arrayList.indexOf(str + ch);
        System.out.println(obrabotka);
        for(String s : arrayList) {
            System.out.print(s + "| ");
        }
    }
    public static boolean prov(ArrayList<String> arr, String str) {
        for(String s : arr) {
            if (java.util.Objects.equals(s, str)) {
                return true;
            }
        }
        return false;
    }
}
