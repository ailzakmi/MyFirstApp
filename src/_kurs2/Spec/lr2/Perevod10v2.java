package _kurs2.Spec.lr2;

public class Perevod10v2 {
    public static void main(String[] args) {
        double number = 642.891;
        int integerPart = (int) number; // ����� ����� �����
        double fractionalPart = number - integerPart; // ������� ����� �����

        // �������������� ����� ����� � �������� �������������
        StringBuilder binaryInteger = new StringBuilder();
        while (integerPart > 0) {
            binaryInteger.insert(0, integerPart % 2);
            integerPart /= 2;
        }

        // �������������� ������� ����� � �������� �������������
        StringBuilder binaryFractional = new StringBuilder();
        while (fractionalPart > 0 && binaryFractional.length() < 5) {
            fractionalPart *= 2;
            binaryFractional.append((int) fractionalPart);
            fractionalPart -= (int) fractionalPart;
        }

        // ����� ��������� �������������
        System.out.println("����� �����: " + binaryInteger);
        System.out.println("������� �����: " + binaryFractional);
        System.out.println("�� �����: " + binaryInteger + "." + binaryFractional);
    }
}
