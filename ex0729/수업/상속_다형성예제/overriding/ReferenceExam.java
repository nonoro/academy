package ex0729.수업.상속_다형성예제.overriding;

class ObjectExam {
	String str;
    public ObjectExam() {

    }

    public ObjectExam(String str) {
		this.str = str;
    }

	public String toString() {
		return str + " / " + super.toString();
	}

}

class ReferenceExam {
    public static void main(String[] args) {
        char c = 'a';
        String s01 = "장희정";
        String s02 = "Java";
        String s03 = new String("월요일");

        ObjectExam oe1 = new ObjectExam("집에가");
        ObjectExam oe2 = new ObjectExam("안녕");

        System.out.println(c);// a
		/**
		 * println(Object obj)또는 print(Object obj) 메소드의
		 * 인수로 객체가 전달되면 무조건 obj.toString() 메소드가 호출되고 그 메소드가
		 * 리턴하는 값을 출력한다.
		 */

        System.out.println(s01);// 장희정
        System.out.println(s02);// Java , String에 오버라이딩 되어있는 toString()을 호출함
        System.out.println(s03);//

        System.out.println(oe1);// 주소값, Object에 정의되어있는 toString()호출함
        System.out.println(oe2);// 주소값

    }
}
