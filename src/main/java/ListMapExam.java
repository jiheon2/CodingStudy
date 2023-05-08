import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Map<String, String>> list = new ArrayList<>();
        //최종 저장되는 list구조

        Map<String, String> map = null;
        // list 구조안에 저장될 Map객체

        for(int i=0; i<3; i++) {
            System.out.print("이름 : ");
            String name = s.nextLine();

            System.out.print("이메일 : ");
            String email = s.nextLine();

            System.out.print("부서 : ");
            String dept = s.nextLine();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null; // 다 사용한 메모리 비우기
            }
        int listsize = list.size();

        System.out.println("저장된 데이터 수 : " + listsize);

        System.out.println("1세대 반복문");

        for(int i=0; i<listsize; i++) {
            Map<String, String> rMap = list.get(i);

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;
        }

        System.out.println("2세대 반복문");

        for(Map<String, String> rMap : list) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        }

        System.out.println("3세대 반복문");
        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });

        System.out.println("4세대 반복문");
        list.parallelStream().forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });

        System.out.println("1.5세대 반복문");

        Iterator<Map<String, String>> it = list.iterator();

        while(it.hasNext()) {
            Map<String, String> rMap= it.next();

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;
        }
    }
}
//list는 자바에서 만든 모든 데이터타입을 사용할 수 있다
// 행단위로 list.add  / db는 한줄(행) 단위로 데이터를 처리
// 열단위로 hashmap / 각 컬럼명과 컬럼의 값은 map.put으로 입력
// map을 다 사용하면 null값 / 메모리를 비워줘야함
