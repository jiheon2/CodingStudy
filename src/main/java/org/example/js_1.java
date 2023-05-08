package org.example;
import java.util.Scanner;
public class js_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");

        if (!str.startsWith("("))
            System.out.printf("(");

//        System.out.print(str);

        for (int i = 0; i < str.length(); i++)
            System.out.printf("%c",str.charAt(i));

        if(!str.endsWith(")"))
            System.out.printf(")");
    }
}
