package _kurs2.Arhivator;

import javax.swing.*;
        import java.io.*;
        import java.util.*;
        import java.util.List;

public class Arc {
    public static File file;
    public static String fileName;
    public static String filePath;
    public final static char[] alphaRUS = {'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�',
            '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    public static void compress() throws IOException {
        String uncompressed;
        String uncompressed1;
        JFileChooser fileopen = new JFileChooser(System.getProperty("user.dir"));

        int ret = fileopen.showDialog(null, "������� ����");
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