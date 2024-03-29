package _kurs1.lr10.Example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JsonAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String title = in.nextLine();
        System.out.println("Введите автора: ");
        String author = in.nextLine();
        JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser.parse(new FileReader("src/_kurs1.lr10/example2/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject library = (JSONObject) obj;
        JSONArray books = (JSONArray) library.get("books");
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", 2023);
        books.add(newBook);

        library.put("books",books);

        try (FileWriter file = new FileWriter("src/_kurs1.lr10/example2/example-json.json")) {
            file.write(library.toJSONString());
            System.out.println("Новая книга добавлена.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
