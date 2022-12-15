package laba8.gr074001.zhuravliov;

import laba8.gr074001.zhuravliov.string_array.*;

public class Main {
    public static void main(String[] args) {
        StaticStringArray stringArray = new StaticStringArray(3);

        stringArray.add("опаопа ");
        stringArray.add("о папа");
        stringArray.add("Привет");
        stringArray.add("Андрей");
        stringArray.add("ТУТУРУРУ");
        stringArray.add("ТУТУРУРУ");

        stringArray.print();

        NewClass.function();
        System.out.println("Test message");
    }
}