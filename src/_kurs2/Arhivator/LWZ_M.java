package _kurs2.Arhivator;

import java.util.ArrayList;

public class LWZ_M {
    public static void main(String[] args) {
        String fraza = "Алгоритм Лемпеля — Зива — Уэлча (Lempel-Ziv-Welch, LZW) — это универсальный алгоритм сжатия данных без потерь, созданный Авраамом Лемпелем, Яаковом Зивом и Терри Велчем. Он был опубликован Велчем в 1984 году в качестве улучшенной реализации алгоритма LZ78, опубликованного Лемпелем и Зивом в 1978 году. Алгоритм разработан так, чтобы его было достаточно просто реализовать как программно, так и аппаратно.";
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
