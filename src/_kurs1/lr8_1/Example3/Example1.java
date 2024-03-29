package _kurs1.lr8_1.Example3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;

        try {
            String symbol = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/_kurs1.lr8_1/Example3/stih.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("src/_kurs1.lr8_1/Example3/Rstih.txt", StandardCharsets.UTF_8);

            int str = 0;
            int words;
            String str1;

            while ((str1 = br.readLine()) != null) {
                words = 0;
                if (str1.length() != 0) {
                    out.print("Строка: " + str + " ");
                    for (String word : str1.split(" ")) {
                        if (symbol.contains(word.substring(0, 1))){
                            out.print(word + " ");
                            words++;
                        }
                    }
                } else out.print("Строка: " + str + " ");
                out.print(" Количество слов: " + words);
                str++;
                out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!" + e);
        }
        finally{
            Objects.requireNonNull(br).close();
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}
//        Создать проект, позволяющий из одного текстового файла,
//        содержащего несколько строк (тип String) заранее подготовленного текста
//        на русском языке (Пушкин, Лермонтов или другой российсмки классик на
//        Ваш вкус), построчно переписать в другой текстовый файл слова
//        начинающиеся с согласных букв..
//        Требования:
//        – слова из предложения выделять методом split();
//        – в новом файле следует указать номер строки, в которой иско- мые
//        слова находились в исходном файле;
//        – для каждой строки указать количество выбранных слов.