package _kurs2.Arhivator;

import java.util.HashMap;
import java.util.Map;

public class Arhiv {

    public static void main(String[] args) {
        String s = " aaa bb cccc rr";
        String s2 = "aaaa bbb ccccc";
        Map<Character, Long> global = new HashMap<Character, Long>();
        mergeMap(global, symbolFreq(s));
        mergeMap(global, symbolFreq(s2));

        System.out.println(global);
    }

    private static void mergeMap(Map<Character, Long> target, Map<Character, Long> src) {
        for (Character c : src.keySet()) {
            if (target.containsKey(c)) {
                target.put(c, target.get(c) + src.get(c));
            } else {
                target.put(c, src.get(c));
            }
        }
    }

    public static Map<Character, Long> symbolFreq(String s) {
        Map<Character, Long> map = new HashMap<Character, Long>();
        char[] cars = s.toCharArray();
        for (char c : cars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1L);
            }
        }
        return map;
    }
}