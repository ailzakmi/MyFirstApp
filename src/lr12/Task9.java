package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String string = "—ане шЄл 20 год Ч 1 пора отрочества. «имой управл€ющий рестораном, осторожный, лЄгкий и злой, как хорЄк, предложил маме устроить —аню мальчиком, сперва в буфет, а дальше Ч видно будет. ¬нешность дл€ холу€ Ч сама€ подход€ща€. ќп€ть же, грамоту знает. ≈жели за стакан не возьмЄтс€, годам к 30 до буфетчика выслужитс€.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("—трока после считывани€: ");
        for(String a : strings){
            System.out.println(a);
        }

        List<String> strP = filter(strings);

        System.out.println("\n—трока после фильтрации: ");
        for(String s : strP){
            System.out.println(s);
        }
    }

    public static List<String> filter(List<String> strings){
        return strings.stream().filter(a -> a.matches("[а-€ј-яЄ®]+")).collect(Collectors.toList());
    }
}

//        9. Ќапишите функцию, котора€ принимает на вход список строк
//        и возвращает новый список, содержащий только те строки,
//        которые содержат только буквы (без цифр и символов).