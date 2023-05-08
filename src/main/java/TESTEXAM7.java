public class TESTEXAM7 {
    public static void main(String[] args) {
        int k = 2;
        int i = 1;

        while(i<10) {
            System.out.printf("%d X %d = %d\t", k, i, k*i);
            if(i==9) {
                i = 0;
                k++;
            }
            i++;
            System.out.println();
            if(k==10) {
                break;
            }
        }
    }
}
