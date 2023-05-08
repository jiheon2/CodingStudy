import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
         //키(중복불가)값(중복허용)
        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        // 출력방식 1
        System.out.println("조회 결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));
        //get 뒤에는 키 이름


        // 출력방식 2
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
        // 변수 entry
        // entrySet은 Map구조 데이터를 Set구조로 변환하기 위해 개발된 데이터 구조 / 키들만 리스트에 넣는 것을 의미
        // List와 Set 둘다 1차원 배열로 저장 / list는 중복허용 / set은 중복 불가
        // set의 단점 : 중복된게 있는지 없는지 항상 체크하기 때문에 저장속도가 느림 / 저장 위치가 꼬임
        // Map의 키는 Set 데이터구조와 같이 중복을 허용하지 않음
        // Map 저장된 데이터 한개 마다 Set 구조로 데이터를 저장함
    }
}
// 코딩할때 가장 많이 나옴
// 키와 값을 항상 같이 저장하는 데이터 구조 / 키는 절대로 중복되지 않는 유일한 값
// 키 = 컬럼명 값 = 컬럼에 저장된 데이터
// pk 유니크키 공부