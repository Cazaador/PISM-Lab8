package laba8.gr074001.zhuravliov;

import java.util.Scanner;

public class NewClass {
    public static String function(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение:");
        str = scanner.nextLine();
        return str;
    }
}
