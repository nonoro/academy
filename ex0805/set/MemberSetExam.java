package ex0805.set;


import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
    private Set<Member> set = new HashSet<>(); // 중복이 안됨

    public MemberSetExam() {
        /* 추가(Set은 먼저 hashcode()를 호출해서 다르면 다른객체, 같으면 equals 호출해서 리턴하는 값 true이면 중복
             false이면 다른 객체로 인식해서 저장한다 */
        set.add(new Member("희정", 13, "서울"));

        set.add(new Member("희정2", 12, "서울"));
        set.add(new Member("희정2", 22, "서울"));

        set.add(new Member("나영", 13, "서울"));
        set.add(new Member("희정2", 13, "서울"));
        set.add(new Member("민정", 13, "서울"));


        System.out.println("저장된 객체의 수 : " + set.size());

    }


    public static void main(String[] args) {
        new MemberSetExam();
    }

}
