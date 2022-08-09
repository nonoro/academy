package ex0805.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExam extends HashSet<String> {

    public SetExam(String[] args) {
        // 데이터 추가
        for (String name : args) {
            boolean re = super.add(name);
            System.out.println(name + "추가 결과 : " + re);
        }

        System.out.println("추가된 개수 : " + super.size());
        System.out.println(this);
        ///////////////////////////////////////////////////////////////
        /**
         * Set안에 요소를 하나씩 꺼내기
         */
        Iterator<String> it = super.iterator();
        while (it.hasNext()) { // 요소가 더 존재한다면
            String s = it.next();// 요소를 꺼낸다
            System.out.print(s + "\t");
        }

        /**
         * 개선된 for문으로 바꾸기
         */
        System.out.println("\n\n-----------------개선된 for문으로 변경해보자-----------------\n");
        for (String name : this) {
            System.out.print(name + "\t");

        }

        /**
         * 제거하기
         */

        System.out.println("\n---------------------- 제거해보자 ----------------------");
        boolean re = super.remove("예찬");

        System.out.println("제거 결과 : " + re);
        System.out.println("제거 후 : " + this);

    }


    public static void main(String[] args) {
        new SetExam(args);


    }

}
