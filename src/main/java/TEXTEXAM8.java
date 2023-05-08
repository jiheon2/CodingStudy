import java.util.Scanner;

public class TEXTEXAM8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        int i, k;

        System.out.printf("입력값 : ");

        for(i=0; i<5; i++) {
            a[i] = s.nextInt();
        }

        for(k=0; k<a.length; k++) {
            if(a[i] == a[k]) {
                System.out.printf("중복\n");
                i--;
                break;
            }
        }
    }
//        for(i=0; i<a.length)
}
