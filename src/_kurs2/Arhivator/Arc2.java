package _kurs2.Arhivator;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Arc2 {
    private static final int BUFFER = 80000;

    public void zip(String[] files, String zipFileName) {
        ZipOutputStream out = null;
        try {
            out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFileName)));
            byte[] data = new byte[BUFFER];
            for (int i = 0; i < files.length; i++) {
                processFile(out, data, files[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(out);
        }
    }

    private void processFile(ZipOutputStream out, byte[] data, String file) {
        BufferedInputStream origin = null;
        try {
            origin = new BufferedInputStream(new FileInputStream(file), BUFFER);
            ZipEntry entry = new ZipEntry(file.substring(file.lastIndexOf("/") + 1));
            out.putNextEntry(entry);
            int count;
            while ((count = origin.read(data, 0, BUFFER)) != -1) {
                out.write(data, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(origin);
        }
    }

    private void close(Closeable closeable){
        if (null != closeable){
            try {
                closeable.close();
            } catch (IOException ignored) {
            }
        }
    }
}
