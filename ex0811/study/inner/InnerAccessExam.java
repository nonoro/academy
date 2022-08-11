package ex0811.inner;

class Test {
    int a = 10;
    static int b = 5;

    public void aa() {

    }

    public static void bb() {

    }

    /**
     * 인스턴스멤버클래스
     * : static선언은 안된다. - 단 java version 16이상부터 가능하다.
     * : non static은 가능
     * : static필드 static메소드 접근은 가능
     * : 클래스앞에 access modifier 4가지 모두 선언가능하다
     */

    protected class InstanceInner {
        int a = 7;

        //        static int c = 100;
        public void test() {
            System.out.println(a);  // 7
            System.out.println(this.a);  // 7
            System.out.println(Test.this.a);  // 10

            System.out.println(b); // 5
            System.out.println(Test.b); // 5

            aa();
            bb();

        }
    }


/////////////////////////////////////////////////////////////////////////////////


    /**
     * static멤버 클래스
     * : 클래스 앞에 access modifier 4가지 모두 선언가능하다
     * : static, non-static 모두 선언가능하다.
     */

    static class StaticInner {
        int a = 3;
        static int c = 6;

        public void test() {
            System.out.println(a);
            System.out.println(this.a);

//            System.out.println(Test.this.a); // outer 쪽 non-static은 접근 불가

            System.out.println(b);
            System.out.println(Test.b);
//            System.out.println(Test.this.b); //static 안에선 외부static 호출시 this. 사용불가
//            aa(); //non-static메소드이므로 접근불가
            bb();

        }
    }

    public void test2() {
        System.out.println("Test의 test2() 메소드 call.......");

        /**
         * 로컬 이너클래스
         *  : access modifier 올 수 없고 static 선언안됨.
         */
        class LocalInner {
            int a = 3;
//            static int b = 7; //static은 지역변수에는 쓸 수 없다 왜냐면 지역변수는 딱 그 지역에서만 쓰고 사라져서
            int b = 7;

            public void aa() {
                System.out.println("LocalInner의 aa() 메소드 호출됨");
            }
        }

        LocalInner li = new LocalInner();
        li.aa();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
public class InnerAccessExam {
    public static void main(String[] args) {
        System.out.println("--------------------1. 인스턴스 멤버 클래스 -------------------------------------");
        Test t = new Test();
        Test.InstanceInner ti = t.new InstanceInner();
        ti.test();

        System.out.println("\n-2. static 멤버 클래스-------------------------------------------------");

        Test.StaticInner ts = new Test.StaticInner();
        ts.test();

        System.out.println("\n-3. Local 이너 클래스-------------------------------------------------");
        t.test2();
    }
}
