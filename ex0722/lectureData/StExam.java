package ex0722.lectureData;

class Test1 {
    int i = 5;
    static int j = 10;

    public void  aa() { // non-static영역에서는 static, non-static모두 접근가능하다.
        System.out.println(i);
        System.out.println(this.i);

        System.out.println(j);
        System.out.println(this.j);

        System.out.println(Test1.j);

        /////////////////////////////////////////////////

        bb();
        this.bb();

        dd();
        this.dd();
        Test1.dd(); // this보단 이걸 권장
    }

    public void bb() {
        System.out.println("this = " + this);
    }

    public static void cc() { // static 메서드 내에서 static만 접근가능, this키워드 사용불가
//        System.out.println(i);    // non-static이므로 사용불가
//        System.out.println(this.i); // non-static이므로 사용불가

        System.out.println(j);
//        System.out.println(this.j); // static에서 this 사용불가

        System.out.println(Test1.j);

        /////////////////////////////////////////////////

//        bb();        // non-static이라서 사용 불가
//        this.bb();   // non-static이라서 사용 불가

        dd();
//        this.dd();   // this 사용 불가
        Test1.dd(); // this보단 이걸 권장
    }
    public static void dd() {}
}



public class StExam {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test1 test2 = new Test1();
        Test1 test3 = new Test1();

//        test1.bb();

        System.out.println("test1 = " + test1);
        System.out.println("test2 = " + test2);
        System.out.println("test3 = " + test3);

        ///////////non-static 접근////////////////////////
        System.out.println("test1.i = " + test1.i);
        System.out.println("test2.i = " + test2.i);
        System.out.println("test3.i = " + test3.i);

        // 값 변경
        test1.i = 100;
        System.out.println("----------변경 후");
        System.out.println("test1.i = " + test1.i);
        System.out.println("test2.i = " + test2.i);
        System.out.println("test3.i = " + test3.i);

        /////////////////static 접근//////////////////////
        System.out.println("test1.j = " + test1.j);
        System.out.println("test2.j = " + test2.j);
        System.out.println("test3.j = " + test3.j);
        System.out.println("Test1.j = " + Test1.j);

        //값 변경
        test1.j = 50;
        System.out.println("-------------------변경후");
        System.out.println("test1.j = " + test1.j);
        System.out.println("test2.j = " + test2.j);
        System.out.println("test3.j = " + test3.j);
        System.out.println("Test1.j = " + Test1.j);





    }
}



