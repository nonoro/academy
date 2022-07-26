package ex0726.getter_setter배열예제;

/*
    학생의 정보(속성 - 이름, 나이, 주소)를 관리할 객체
    ValueObject = VO, DTO(Data Transfer Object), Domain
    외부에서 직접 적근 못하도록 은닉함
 */

public class Student {
    private String name; // null
    private int age; // 0
    private String addr; // null;

    /*

    멤버필드를 조회하고 수정할 수 있는 메소드 제공

    */

    /*
	 setXxx 메소드
		1) 제한자 : public
		2) 리턴타입 : void
		3) 인수는 필수
	*/
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("나이는 18보다 작을  수 없습니다.");
        }
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    /*
	 getXxx메소드
		1) 제한자 : public
		2) 리턴타입 : 필수
		3) 인수는 없음
	*/
    public String getName() {
        return name + "님";
    }
    public int getAge() {
        return age;
    }
    public String getAddr() {
        return addr;
    }
}
