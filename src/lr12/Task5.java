package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args){
        String string = "Шёл 1900 год, из-за двух гладких нолей казавшийся Сане похожим на одноместную коляску-эгоистку. И правда — всё вокруг мелькало, с невиданной прежде быстротой менялось и, вдруг замерев, подпрыгивало.";

        List<String> strings = List.of(string.split(","));
        System.out.println("Строка после считывания: ");
        for(String a : strings){
            System.out.println(a);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите подстроку: ");
        String subString = in.nextLine();

        List<String> stringAfter = filterString(strings, subString);

        System.out.println("\nСтрока после фильтрации: ");
        for(String a : stringAfter){
            System.out.println(a);
        }
    }

    public static List<String> filterString(List<String> strings, String subString){
        return strings.stream().filter(s -> s.contains(subString)).collect(Collectors.toList());
    }
}

//        5. Напишите функцию, которая принимает на вход список строк
//        и возвращает новый список, содержащий только те строки, которые содержат заданную подстроку.