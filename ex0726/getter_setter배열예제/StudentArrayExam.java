package ex0726.getter_setter배열예제;

public class StudentArrayExam {
    public static void main(String[] args) {
        // 학생 3명 관리하는 배열을 만들고 싶다!
        Student[] stArr = new Student[3];
       /*
        System.out.println("stArr = " + stArr);
        for (Student st : stArr) {
        System.out.println(st);
        */
        // 각 배열방에 Student를 생성해서 넣는다.
        for (int i = 0; i < stArr.length; i++) {
            stArr[i] = new Student(); // 멤버필드를 초기화한다.

            // 값을 할당 -> 수정 -> setArr사용
            /*stArr[i].name = "희정" + i;
            stArr[i].age = 20 + i;
            stArr[i].addr = "경기도 오리 " + i;*/
            stArr[i].setName("화정" + i);
            stArr[i].setAge(19 - i);
            stArr[i].setAddr("경기도 오리" + i);

        }

        // 학생의 정보를 출력해보자
        System.out.println("*********학생의 정보*********");
        for (int i = 0; i < stArr.length; i++) {
  /*          System.out.print("이름: " + stArr[i].name + "\t");
            System.out.print("나이: " + stArr[i].age + "\t");
            System.out.print("주소: " + stArr[i].addr + "\n");*/

            System.out.print("이름: " + stArr[i].getName() + "\t");
            System.out.print("나이: " + stArr[i].getAge() + "\t");
            System.out.print("주소: " + stArr[i].getAddr() + "\n");

        }
    }// 메인끝

} // 클래스끝

