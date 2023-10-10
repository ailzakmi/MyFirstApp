package _kurs2.Spec.lr3;

public class Convertation2 {
    public static void main(String[] args) {
        int number = 10011; // Измененное положительное число
        String binary = convertToBinary(number);
        System.out.println("Число " + number + " в двоичной форме: " + binary);
    }

    public static String convertToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        int numDigits = binary.length();
        int leadingZeros = 32 - numDigits; // Предполагая, что числа имеют 32-разрядное двоичное представление
        String formattedBinary = String.format("%0" + leadingZeros + "d%s", 0, binary);
        return formattedBinary;
    }
}