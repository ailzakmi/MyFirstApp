package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        String string = "—ледом подпрыгивало и —анино сердце и, оказавшись где-то в горле, ухало вниз, маленькое, дрожащее и всЄ-таки Ч ликующее. —ан€ не был готов к таким переменам Ч не поспевал. ќн стал скверно спать и за несколько недель выт€нулс€, почти сравн€вшись ростом с мамой. ќт детских кудр€шек не осталось и следа: волосы —ани потемнели, стали жЄсткими, пр€мыми и Ч к его ужасу и стыду Ч опушили даже верхнюю губу и подмышки.";
        List<String> strings = List.of(string.split(","));
        System.out.println("—трока после считывани€: ");
        for(String s : strings){
            System.out.println(s);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите длину строки: ");
        int length = in.nextInt();

        List<String> strP = filter(strings, length);

        System.out.println("\n—трока после фильтрации:");
        for(String s : strP){
            System.out.println(s);
        }


    }

    public static List<String> filter(List<String> strings, int length){
        return strings.stream().filter(s -> s.length() > length).collect(Collectors.toList());
        //return strings.stream().filter(s -> s.length() > length).toList();
    }
}

//        7. Ќапишите функцию, котора€ принимает на вход список строк
//        и возвращает новый список, содержащий только те строки,
//        которые имеют длину больше заданного значени€.