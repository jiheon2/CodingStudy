public class TESTEXAM2 {
    public static void main(String[] args) {
        for(int i=0; i<4; i++) {
            for(int k=3; k>i; k--) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2; i>=0; i--) {
            for(int k=2; k>=i; k--) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

