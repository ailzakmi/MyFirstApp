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
        map.put(0, "�����");
        map.put(1, "����");
        map.put(2, "�������");
        map.put(3, "���������");
        map.put(4, "���������");
        map.put(5, "�����");
        map.put(6, "���������");
        map.put(7, "����");
        map.put(8, "�����");
        map.put(9, "������");
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

    public static void elseZero(Map<Integer, String> map) { // ��� ����� ������, ���� HashMap �� ������ ���������� �����?
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

//        10. ��������� HashMap 10 ��������� <Integer, String>. ����� ������, � ������� ���� > 5.
//        ���� ���� = 0, ������� ������ ����� �������. ����������� ��� �����, ��� ����� ������ > 5.