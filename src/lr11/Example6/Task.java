package lr11.Example6;

import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<Integer, String> data = mapValue();
        System.out.println(bigFive(data));
        elseZero(data);
        System.out.println();
        System.out.println(umnoz(data));
    }

    public static Map<Integer, String> mapValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Денис");
        map.put(1, "Рома");
        map.put(2, "Алексей");
        map.put(3, "Александр");
        map.put(4, "Екатерина");
        map.put(5, "Света");
        map.put(6, "Елизавета");
        map.put(7, "Таня");
        map.put(8, "Серёжа");
        map.put(9, "Полина");
        return map;
    }

    public static Map<Integer, String> bigFive(Map<Integer, String> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getKey() > 5) {
                newMap.put(set.getKey(), set.getValue());
            }
        }
        return newMap;
    }

    public static void elseZero(Map<Integer, String> map) { // как найти строки, если HashMap не хранит одинаковые ключи?
        map.entrySet().stream()
                .filter(e -> e.getKey() == 0)
                .forEach(e -> System.out.print(e.getValue() + ", "));
    }

    public static int umnoz(Map<Integer, String> map) {
        int sum = 1;
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getValue().length() > 5) {
                sum = sum * set.getKey();
            }
        }
        return sum;
    }
}

//        10. Заполнить HashMap 10 объектами <Integer, String>. Найти строки, у которых ключ > 5.
//        Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки > 5.