package Java_code_example_alone;
import java.util.Scanner;

public class Ex02_3 {
    public static void main(String[] args) {
        int a, b, c;
        int result;

        Scanner s = new Scanner(System.in);
        System.out.print("코딩연습");
        System.out.print("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();
        System.out.print("세번째 계산할 값을 입력하세요 ==>");
        c = s.nextInt();

        result = a + b * c;
        System.out.print(result);
    }
}

