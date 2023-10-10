package _kurs1.lr10.Example4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ReadEXEL {
    public static void main(String[] args) throws IOException {
        maining(0);
    }

    public static void maining(int i) throws IOException {
        Scanner in = new Scanner(System.in);
        try {

            String filePath = null;

            if (i == 0) {
                filePath = "src/_kurs1.lr10/Example4/ExampleExcel.xlsx";//путь не правильный, сделано для провертки catch-а,
                // в консоли нужно будет ввести: src\_kurs1.lr10\Example4\ExampleEXEL.xlsx
            }
            else if (i > 0) {
                System.out.println("Введите полный путь к файлу: ");
                filePath = in.nextLine();
            }

            FileInputStream inputStream = new FileInputStream(Objects.requireNonNull(filePath));

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("Товары");

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден");
            System.out.println("Попробовать снова? (yes/no) (да/нет)");
            String why = in.nextLine();
            if (why.equals("y") | why.equals("yes") | why.equals("д") | why.equals("да")) {
                ReadEXEL.maining(1);
            }

        }
    }
}
