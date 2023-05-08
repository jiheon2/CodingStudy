import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");
        list.add("김영운");
        list.add("배수환");
        list.add("김주경");
        list.add("윤미현");
        // List 객체에 데이터 추가하기

        int listSize = list.size();
        // List 저장된 데이터 수

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for(int i=0; i<listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }
        // 일반적인 반복문 = 1세대
        // 단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함 / 항상 배열의 값 X 2의 연산횟수를 가짐

        System.out.println("2세대 반복문");

        for(String name : list) {
            System.out.println("이름 : " + name);
        }
        // 개선된 for 반복문(for each문) = 2세대
        // 장점 : 1세대 반복문의 단점인 반드시 반복의 횟수를 알고 있어야 하는 반복문의 문제점을 개선함
        // list 에서 하나씩 꺼내서 name에 대입 / : 연산자의 의미 = 배열의 값을 변수에 하나씩 대입해야 할 때 사용

        System.out.println("3세대 반복문");

        list.forEach(name -> System.out.println("name : " + name));
        // 개선된 for 반복문 = 3세대
        // 장점 : 2세대보다 코딩해야 하는 줄(라인)이 감소함, 람다식 적용, 자바1.8부터 사용가능
        // list컬렉션에서 .forEach함수 사용 > list 값을 받기위한 변수 name을 선언

        System.out.println("4세대 반복문");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));
        // 개선된 for 반복문 = 4세대
        // 장점 : 3세대에 비동기식 처리 방법 적용(저장순서에 상관없이 처리 결과를 가져옴 / 속도가 가장 빠름)
        // 단점 : 처리 완료가 누가 먼저 될지 알 수 없음. 따라서 모든 경우에 다 쓸 수 없음
        // 스레드를 두개 이상 만듬 / 결과 데이터 공유 불가능
        // parallel 병렬

        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
        // while 반복문 = 1.5세대 > for 반복문 1세대보다 처리속도가 빠름
        // 자바 1.7까지 가장 많이 쓰던 반복문
        // 단점 : 코드가 길어짐
        // iterator 반복을 하기위해 만들어진 데이터 타입
        // iterator를 사용해 1차원 배열로 바꿈
        // .hasNext() 다음 값을 가진다면 있으면 true 없으면 false true면 다시 반복 false면 반복문 종료
        // .next() 다음으로 이동
    }
}
// ArrayList 일반적인 프로그램 LinkedList 특정 프로그램에서 사용
// LinkedList를 써야하는 가장 큰 이유 > 데이터를 정렬을 해야 할 때 매우 편함 bcz 앞 뒤 포인터 주소값을 가지고 있음 / 데이터 삽입하는 경우
// ArrayList 는 오름차순만 가능 LinkedList는 오름,내림 전부 가능