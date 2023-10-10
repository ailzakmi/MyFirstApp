package _kurs2.Spec.lr2;

public class Predstavlenie {
    public static void main(String[] args) {
        double number = 64.28;

        // ���������� ����� �����
        int sign = (number >= 0) ? 0 : 1;
        String strignBinary = Integer.toBinaryString(sign);

        // ��������� ��������
        double absoluteValue = Math.abs(number);
        int integerPart = (int) absoluteValue;
        int fractionPart = (int) ((absoluteValue - integerPart) * Math.pow(10, 8));
        String integerBinary = Integer.toBinaryString(integerPart);
        String fractionBinary = Integer.toBinaryString(fractionPart);
        String mantissa = integerBinary + fractionBinary;
        mantissa = mantissa.substring(0, 8);

        // ��������� ����������
        int exponent = 0; // � ������ ������ ���������� ����� 0
        String exponentBinary = Integer.toBinaryString(exponent);
        while (exponentBinary.length() < 4) {
            exponentBinary = '0' + exponentBinary;
        }

        // ����� �����������
        System.out.println("����: " + strignBinary);
        System.out.println("��������: " + mantissa);
        System.out.println("����������: " + exponentBinary);

        // ����� ���������
        String result = strignBinary + mantissa + exponentBinary;
        System.out.println("����� ���������: " + result);
    }
}
