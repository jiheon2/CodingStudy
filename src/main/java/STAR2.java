import java.util.Scanner;

public class STAR2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, k;
        int a = s.nextInt();

        for(i=1; i<=a; i++) {
            for(k=0; k<i; k++) {
                System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }

