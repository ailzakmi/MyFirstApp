package _kurs2.Spec.lr3;

public class Convertation3 {
    public static void main(String[] args) {
        int number1 = 10011;
        int number2 = 10001;

        String binary1 = convertToBinary(number1);
        String binary2 = convertToBinary(number2);

        System.out.println("Число " + number1 + " в двоичной форме: " + binary1);
        System.out.println("Число " + number2 + " в двоичной форме: " + binary2);

        int sum = addBinaryNumbers(number1, number2);
        int difference = subtractBinaryNumbers(number1, number2);

        String binarySum = convertToBinary(sum);
        String binaryDifference = convertToBinary(difference);

        System.out.println("Сумма: " + binarySum);
        System.out.println("Разность: " + binaryDifference);
    }

    public static String convertToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        int numDigits = binary.length();
        int leadingZeros = 32 - numDigits;
        String formattedBinary = String.format("%0" + leadingZeros + "d%s", 0, binary);
        return formattedBinary;
    }

    public static int addBinaryNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtractBinaryNumbers(int number1, int number2) {
        return number1 - number2;
    }
}