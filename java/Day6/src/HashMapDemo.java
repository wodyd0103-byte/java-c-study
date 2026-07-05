import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        // ==생성 <키 타입, 값 타입>==
        HashMap<String,Integer> scoreMap = new HashMap<>();

        // ==추가 put <키:값>==
        scoreMap.put("김자바",90);
        scoreMap.put("이파이썬",85);
        scoreMap.put("박스프링",92);
        scoreMap.put("최코틀링",78);

        // ==조회 get(키)==
        System.out.println("김자바의 점수: "+scoreMap.get("김자바"));

        // ==결산 ==
        System.out.println("박스프링 존재? "+scoreMap.containsKey("박스프링"));
        System.out.println("100점 존재?"+scoreMap.containsValue(100));

        // == 수정 같은키로 put==
        scoreMap.put("김자바",95);  // 90 -> 95로 변경
        System.out.println("김자바 수정 후: "+scoreMap.get("김자바"));

        // ==삭제==
        scoreMap.remove("최코틀링");
        System.out.println("삭제 후 크기: "+scoreMap.size());

        //전체 순회
        System.out.println("--전체 성적--");
        for(String name: scoreMap.keySet()) {
            System.out.println(name+":"+scoreMap.get(name)+"점");
        }
    }
}