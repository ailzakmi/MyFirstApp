package _kurs2.Arhivator;

import javax.swing.*;
        import java.io.*;
        import java.util.*;
        import java.util.List;

public class Arc {
    public static File file;
    public static String fileName;
    public static String filePath;
    public final static char[] alphaRUS = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я',
            'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public static void compress() throws IOException {
        String uncompressed;
        String uncompressed1;
        JFileChooser fileopen = new JFileChooser(System.getProperty("user.dir"));

        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            file = fileopen.getSelectedFile();
        }

        fileName = file.getName();
        filePath = file.getAbsolutePath();

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), "UTF-8"));
        StringBuilder text = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            text.append(line);
        }
        reader.close();
        uncompressed1 = text.toString();
        uncompressed = uncompressed1.substring(1, uncompressed1.length());


        int dictSize = 322;

        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < 256; i++)
            dictionary.put("" + (char) i, i);

        int j = 256;
        for (char c : alphaRUS) {
            dictionary.put("" + c, j);
            j++;
        }

        String w = "";
        List<Integer> result = new ArrayList<Integer>();
        for (char c : uncompressed.toCharArray()) {
            String wc = w + c;
            if (dictionary.containsKey(wc)) {
                w = wc;
            } else {
                result.add(dictionary.get(w));
                dictionary.put(wc, dictSize++);
                w = "" + c;
            }


            if (!w.equals(""))
                result.add(dictionary.get(w));


            FileOutputStream out = new FileOutputStream("compressed.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);


            oout.writeObject(result);
            oout.close();
        }
    }
}