public class TESTEXAM1 {
    public static void main(String[] args) {
        int i, k;
        for(i=1; i<5; i++) {
            for(k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1; i<4; i++) {
            for(k=4; k>i; k--) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for(i=0; i<4; i++) {
            for(k=0; k<i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0; i<4; i++) {
            for(k=0; k<3-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
