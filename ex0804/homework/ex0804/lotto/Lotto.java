package ex0804.homework.ex0804.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
    1. ArrayList를 이용하여 로또번호 6개를 중복없이 저장하고 올림차순으로 정렬해서 출력한다.
 */

//// 생성
//public class Lotto {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(6);
//        while (list.size() < 6) {
//            int number = (int) ((Math.random() * 45) + 1);
//            if (!list.contains(number)) {
//                list.add(number);
//            }
//        }
//        Collections.sort(list);
//        System.out.println(list);
//    }
//}

//상속
public class Lotto extends ArrayList<Integer> {
    public static void main(String[] args) {
        new Lotto();
    }

    public Lotto() {
        super(6); // 부모의 ArrayList에 6칸짜리 리스트 생성
        Random random = new Random();
        while (super.size() < 6) {
            int number = random.nextInt(45) + 1; // int 대신 Integer로 해도됨
            if (!super.contains(number)) {
                super.add(number);
            }
        }
        System.out.println("정렬전 = " + this);
        System.out.println();

        // 정렬하기
//        Collections.sort(this); // 올림차순
//        Collections.sort(this, Collections.reverseOrder()); // 내림차순
//        super.sort(null); // null을 넣으면 기본 정렬 - 올림차순
        super.sort(Collections.reverseOrder()); // 내림차순

        System.out.println("정렬후 = " + this);

    }
}
