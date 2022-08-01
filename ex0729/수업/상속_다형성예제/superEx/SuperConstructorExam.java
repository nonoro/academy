package ex0729.수업.상속_다형성예제.superEx;

import ex0729.수업.상속_다형성예제.helloTest.HelloTest;

import javax.swing.*;
import java.io.InputStream;

class Parent {
//    Parent() {
//    // super(); 생략되어있음 (Object의 super())

//        System.out.println(1);
//    }

    Parent(int i) {
        // super(); 생략되어있음 (Object의 super())
        System.out.println(2);

        HelloTest t;    // 다른 툴에 있기 때문에 import 필요
        JTextField text;
        InputStream is;
    }

    Parent(String s) {
        // super(); 생략되어있음 (Object의 super())

        System.out.println(3);
    }
}

class Child extends Parent { // Child is a Parent 성립
    Child() {
        // super();
        this(10);
        System.out.println(4);
    }

    Child(int i) {
        // super();
        super(i);   // 부모의 int형 하나받는 생성자 호출
        System.out.println(5);
    }

    Child(boolean b) {
        // super();
        super(b + "쫑"); // 부모의 String 하나 받는 생성자 호출
        System.out.println(6);
    }

}

public class SuperConstructorExam {
    public static void main(String[] args) {
//        new Child(); // 생성자 호출된다. 1 4
//        new Child(5); // 생성자 호출된다. 1 5
//        new Child(true); // 생성자 호출된다. 1 6
//        System.out.println();
        /*
             결론 : 자식이 생성될때 부모의 기본생성자를 호출한다.
                    자식생성자 구현부 첫번째 줄에 super() 생략된것과 같다
                    자식이 생성될때 인수가 있는 생성자를 호출하더라도
                    부모의 기본생성자를 호출한다.
         */
        ////////////////////////////////////////////////////////////
        // 만약 1, 2, 3 이 없다면(부모가 생성자를 하나도 만들지 않는다면)
//        new Child(); //
//        new Child(5); //
//        new Child(true); //
//        System.out.println();
        /*
         * 부모의 생성자가 없으면 기본 생성자가 자동으로 삽입되기 때문에
         * 오류없이 잘 실행된다.
         */
        /////////////////////////////////////////////////////////////

        /*
         * 만약 1 없고, 2, 3만 존재한다면(부모가 기본생성자를 만들지 않고
         * 생성자를 만들어 놓았다면..............)
         *  : 자식생성자 구현부 첫번째 줄에서 에러발생한다.
         *  : this(값 ...) 또는 super(값 ....)을이용해서 부모의 기본생성자가 아닌
         *  : 다른 생성자를 호출해야한다.
         *
         */
        new Child(); //

    }
}
