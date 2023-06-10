package Kurs2023_01;

public class Prob {
    public static void main(String[] args) {
        String file = "C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\src\\Kurs2023_01\\temp\\МР ГОСТ 7.32-2017_.docx";
        int all,alk = 0;
        String fileName = "";
        char[] fileArr = file.toCharArray();
        for (int i = 0;i<file.length();i++) {
            if (fileArr[i] == '\\') {
                alk = i;
            }
        }
        for (all=alk+1;all<file.length();all++) {
            fileName = fileName + fileArr[all];
        }
        System.out.println(fileName);
    }
}
