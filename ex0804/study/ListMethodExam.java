package ex0804.study;

import java.util.ArrayList;
import java.util.List;

public class ListMethodExam {
    private List<String> list = new ArrayList<>(5);

    public ListMethodExam(String[] args) {
//        list.add("test");
        // 데이터 추가
        for (String name : args) {
            if (!list.contains(name)) {
                list.add(name); // 끝에 추가
//            list.add(0, name);// 0번지에 추가 계속 0번지에 추가하면서 밀려서 순서가 뒤집힘
//            list.set(0, name); // 0번째 자리를 계속 교체 따라서 가장 마지막에 들어간게 출력됨
            }
        }

        System.out.println(list);

    }

    public void printList() {
        System.out.println("----------List 항목 출력하기 " + "(" + list.size() + ")" + "개" + " --------------------------");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        // 항목 제거하기
//        String re = list.remove(3);
//        System.out.println("re = " + re);  // 제거된 객체

        boolean re = list.remove("환타");
        System.out.println("결과 = " + re);  // 제거된 객체

        System.out.println("---- 제거 후 -------------");
        System.out.println(list);
    }


    public static void main(String[] args) {
        new ListMethodExam(args).printList();
    }
}
