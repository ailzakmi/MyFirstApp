package _kurs1.lr11.Example7;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        String[] strNamesArray = new String[]{"Денис", "Рома", "Алексей", "Александр", "Екатерина", "Света", "Елизавета", "Таня", "Серёжа", "Полина", "Михаил"};
        List<String> strNamesColl = Arrays.asList(strNamesArray);      // Создаем базовую коллекцию из массива String
        ArrayList<String> arrList = new ArrayList<>(strNamesColl);     // Заполняем ArrayList элементами из базовой коллекции
        LinkedList<String> lnkList = new LinkedList<>(strNamesColl);   // Заполняем LinkedList элементами из базовой коллекции
        System.out.println("В ArrayList остался: "+process(arrList));
        System.out.println("В LinkedList остался: "+process(lnkList));
    }

    static String process(ArrayList<String> peoples) {
        int count = 0;
        while (peoples.size() > 1) {                                   // Повторяем цикл пока в коллекции не останется один элемент
            Iterator<String> iter = peoples.iterator();
            while (iter.hasNext()) {
                iter.next();
                count++;
                if (count % 2 == 0) iter.remove();                     // Удаляем четные элементы из коллекции при помощи итератора
            }
        }
        return peoples.get(0);                                         // Возвращаем оставшийся элемент в коллекции
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

//        В кругу стоят N человек, пронумерованных от 1 до N.
//        При ведении счета по кругу вычеркивается каждыи второи человек, пока не останется один.
//        Составить две программы, моделирующие процесс. Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
//        Какая из двух программ работает быстрее? Почему?