package _kurs2.Spec.lr2;

public class Perevod10v2 {
    public static void main(String[] args) {
        double number = 642.891;
        int integerPart = (int) number; // Целая часть числа
        double fractionalPart = number - integerPart; // Дробная часть числа

        // Преобразование целой части в двоичное представление
        StringBuilder binaryInteger = new StringBuilder();
        while (integerPart > 0) {
            binaryInteger.insert(0, integerPart % 2);
            integerPart /= 2;
        }

        // Преобразование дробной части в двоичное представление
        StringBuilder binaryFractional = new StringBuilder();
        while (fractionalPart > 0 && binaryFractional.length() < 5) {
            fractionalPart *= 2;
            binaryFractional.append((int) fractionalPart);
            fractionalPart -= (int) fractionalPart;
        }

        // Вывод двоичного представления
        System.out.println("Целая часть: " + binaryInteger);
        System.out.println("Дробная часть: " + binaryFractional);
        System.out.println("Всё число: " + binaryInteger + "." + binaryFractional);
    }
}
