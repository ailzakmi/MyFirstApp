package lr7_1.Example1;

import lr7_1.Example1.subClassTest;
import lr7_1.Example1.superClassTest;

public class Main {
    public static void main(String[] args) {
        superClassTest superClassObject = new superClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        subClassTest subClassObject1 = new subClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        subClassTest subClassObject2 = new subClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

