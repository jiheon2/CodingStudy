import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class QUIZZ {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); //데이터타입이 정수형인 링크드리스트 선언
        Scanner s = new Scanner(System.in); // 값을 입력받기위해 스캐너 선언

        for(int i=0; i<5; i++) { // i가 0에서 시작해서 4까지 총 5번 반복
            list.add(s.nextInt()); // list에 입력을 5번 받아서 추가함
        }

        list.sort(Collections.reverseOrder()); //리스트 정렬을 하는 메소드를 사용
        System.out.print(list); // 정렬된 메소드를 출력
    }
}
