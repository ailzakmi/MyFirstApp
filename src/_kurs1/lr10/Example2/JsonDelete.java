package _kurs1.lr10.Example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JsonDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser.parse(new FileReader("src/_kurs1.lr10/example2/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject library = (JSONObject) obj;
        JSONArray books = (JSONArray) library.get("books");
        System.out.println("Введите название книги, которую хотите удалить: ");
        String title = in.nextLine();
        Iterator iterator = books.iterator();

        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }
        }

        try (FileWriter file = new FileWriter("src/_kurs1.lr10/example2/example-json.json")) {
            file.write(library.toJSONString());
            System.out.println("Книга "+title+" удалена.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
