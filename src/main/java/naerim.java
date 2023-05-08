import java.util.Scanner;

public class naerim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //5개의 정수를 입력받기 위해 스캐너 선언
        int a[] = new int[5]; // 정수형 배열 a 의 길이가 5라고 선언

        for (int i = 0; i < 5; i++) { // i가 0부터 시작해서 5보다 작을때 i++
            a[i] = s.nextInt();  //배열 a의 i번째 값은 nextInt함수를 통해 입력받음
        }

        for (int i = 0; i < a.length - 1; i++) {  // 배열을 정렬할 횟수를 나타내는 for문
            for (int k = 0; k < a.length - 1 - i; k++) { // 배열의 값들을 비교하는 for문
                if (a[k] < a[k + 1]) { // a배열의 k값이 k+1보다 작다면 내림차순으로 정렬
                    int b = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = b;
                }
            }
        }
// 버블정렬 알고리즘
        for (int i = 0; i < a.length; i++) { // 정렬된 배열을 출력함
            System.out.print(a[i] + " ");
        }
    }
}