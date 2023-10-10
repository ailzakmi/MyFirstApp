package _kurs1.lr10.Example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsoonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title","Война и Мир");
        book1.put("author","Лев Толстой");
        book1.put("year",1896);

        JSONObject book2 = new JSONObject();
        book2.put("title","Мастер и Маргарита");
        book2.put("author","Михаил Булгаков");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books",books);

        try (FileWriter file = new FileWriter("src/_kurs1.lr10/example2/example-json.json")) {
            file.write(library.toJSONString());
            System.out.println("Json файл создан.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
