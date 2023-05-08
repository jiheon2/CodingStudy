public class TESTEXAM6 {
    public static void main(String[] args) {
        int a = 2;
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\t", a, i, a*i);
            if(i==9) {
                i = 0;
                a++;
                System.out.println();
            }if(a==10) {
                break;
            }
        }
    }
}
