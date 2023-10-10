package _kurs2.Spec.lr2;

public class Predstavlenie {
    public static void main(String[] args) {
        double number = 64.28;

        // Вычисление знака числа
        int sign = (number >= 0) ? 0 : 1;
        String strignBinary = Integer.toBinaryString(sign);

        // Выделение мантиссы
        double absoluteValue = Math.abs(number);
        int integerPart = (int) absoluteValue;
        int fractionPart = (int) ((absoluteValue - integerPart) * Math.pow(10, 8));
        String integerBinary = Integer.toBinaryString(integerPart);
        String fractionBinary = Integer.toBinaryString(fractionPart);
        String mantissa = integerBinary + fractionBinary;
        mantissa = mantissa.substring(0, 8);

        // Выделение экспоненты
        int exponent = 0; // В данном случае экспонента равна 0
        String exponentBinary = Integer.toBinaryString(exponent);
        while (exponentBinary.length() < 4) {
            exponentBinary = '0' + exponentBinary;
        }

        // Вывод результатов
        System.out.println("Знак: " + strignBinary);
        System.out.println("Мантисса: " + mantissa);
        System.out.println("Экспонента: " + exponentBinary);

        // Общий результат
        String result = strignBinary + mantissa + exponentBinary;
        System.out.println("Общий результат: " + result);
    }
}
