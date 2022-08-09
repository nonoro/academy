package ex0805.map.mapExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam extends HashMap<Integer, String> {

    public MapExam() {
        //추가
        super.put(10, "장희정");
        super.put(50, "이나영");
        super.put(30, "이효리");
        super.put(40, "장동건");
        super.put(20, "고소영");
        super.put(60, "이민우");

        super.put(30, "상순이"); // key가 같은애를 찾으면 덮어쓰기됨

        System.out.println("저장된 개수 : " + super.size());
        System.out.println(this);

        System.out.println("================ Map에 있는 정보 조회 해보자 ================");

        // Map에 있는 모든 key의 정보를 가져온다
        Set<Integer> set = super.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int key = it.next();
            String value = super.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("================ 개선된 for로 변경해보자 ================");
        for (Integer key : super.keySet()) {
            String value = super.get(key);
            System.out.println(key + " = " + value);
        }


        System.out.println("\n================ Map.Entry<K, V> 사용하기 ================");
        Set<Map.Entry<Integer, String>> s = super.entrySet();
        Iterator<Map.Entry<Integer, String>> ita = s.iterator();
        while (ita.hasNext()) {
            Map.Entry<Integer, String> e = ita.next();
            System.out.println(e.getKey() + "의 " + e.getValue());
        }

        System.out.println("================ 개선된 for로 변경해보자 ================");
        for (Map.Entry<Integer, String> e : super.entrySet()) {
            System.out.println(e.getKey() + "의 " + e.getValue());
        }

    }

    public static void main(String[] args) {
        new MapExam();
    }
}
