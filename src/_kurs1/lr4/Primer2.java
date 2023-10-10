package _kurs1.lr4;

//Пример класса, который преобразует строку в массив символов, затем по номеру символа в кодовой таблице сдвигает его на величину, указанную
//пользователем, и возвращает строку

public class Primer2 {
    public static void main(String[] args) {
    }
    public static String getEncryptString(String encryptString, int shift) {
        char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
        long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
        char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
        //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
        for (int i = 0; i< ArrayChar.length; i++)
        {
            ArrayInt[i] = ArrayChar[i] + shift; // прибавляем к символу с индексом i сдвиг
            ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
        }
        encryptString = new String (ArrayCharNew); // преобразовываем новый массив символов в строку
        return encryptString; // возвращаем строку в метод из которого был вызван текущий метод
    }
}
