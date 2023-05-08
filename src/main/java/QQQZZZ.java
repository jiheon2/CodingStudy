import java.util.Scanner;

public class QQQZZZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa[] = new int[5];
        int bb[] = new int[5];
        int a = bb.length;

        System.out.print("입력값 : ");

        for (int i = 0; i < aa.length; i++) {
            aa[i] = s.nextInt();
            for (int k = 0; k < i; k++) {
                if (aa[i] == aa[k]) {
                    a--;
                }
            }
        }
    }
}

// 값 5개 입력받기 / 중복 검사하기 / 배열에 저장하기 / 출력하기
