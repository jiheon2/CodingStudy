
public class GUGUDAN {
    public static void main(String[] args) {
        for (int i = 2, j = 1; j < 10; j++) {
            System.out.printf("%d X %d = %d \t", i, j, i * j);
            if (j == 9) {
                i++;
                j = 0;
                System.out.println();
            }
            if(i==10) {
                break;
            }
        }
    }
}