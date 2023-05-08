public class sssssssss {
    public static void main(String[] args) {
        int i;
        int k=2;
        for(i=1; k<=9; i++) {
            System.out.printf("%d X %d = %d \n", k, i, k * i);
            if (i == 9) {
                k++;
                i = 1;
            }
        }
    }
}
