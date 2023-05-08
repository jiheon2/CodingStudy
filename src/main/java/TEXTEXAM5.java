public class TEXTEXAM5 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i <= 5; i++) {
            if (i < a) {
                System.out.print("*");
            } else {
                System.out.println();
                a++;
                i = 0;
            }
        }
    }
}
