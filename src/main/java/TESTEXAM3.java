import java.util.Scanner;

public class TESTEXAM3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("값 입력 : ");
        a = s.nextInt();

        if(a%3 == 0) {
            System.out.printf("%d은 3의 배수입니다", a);
        } else {
            System.out.printf("%d은 3의 배수가 아닙니다", a);
        }
    }
}
