package lr3;

public class Task8 {
    public static void main(String[] args) {

        int i = 0, j = 10;
        String letters = "bcdfghklmnpqrstvwxz";
        char[] sym = new char[letters.length()];
        char[] arr = new char[j];

        for (char letter : letters.toUpperCase().toCharArray()) {
            sym[i] = letter;
            i++;
        }

        for (i=0;i < j;i++) {
            arr[i] = sym[i];
        }

        System.out.println(arr);
    }
}


//    Напишите программу, в которой создается символьный массив из 10 элементов.
//    Массив заполнить большими (прописными) буквами английского алфавита.
//    Буквы берутся подряд, но только согласные (то есть гласные буквы ' А ' , ' Е '
//    и ' I ' при присваивании значений элементам массива  нужно пропустить).
//    Отобразите содержимое созданного массива в консольном окне.