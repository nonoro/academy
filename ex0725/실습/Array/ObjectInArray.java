package ex0725.실습.Array;

class ObjectOne {
    public int a;
}

public class ObjectInArray {
    public static void main(String[] args) {

        //메인 메소드에서

        //ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
        ObjectOne[] arr = new ObjectOne[5];

        //5개의 ObjectOne객체를 생성하세요.
        //각 객체가 갖고있는 전역변수 출력
        //각 객체의 주소값 출력

        System.out.println("-----------------주소값-----------------");
        for (int i = 0; i < 5; i++) {
            System.out.print("생성전 : " + "arr[i] = " + arr[i] + " " + "/" + " ");

            arr[i] = new ObjectOne();
            System.out.println("생성후 : " + "arr[i] = " + arr[i] + " ");
        }
        System.out.println();
        System.out.println("개선된 for문");
        for (ObjectOne i : arr) {
            System.out.print("생성전 : " + "arr[i] = " + i + " " + "/" + " ");

            i = new ObjectOne();
            System.out.println("생성후 : " + "arr[i] = " + i + " ");
        }

        //각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.
        //각 ObjectOne 객체의 a를 출력하세요

        System.out.println("-----------------전역변수값-----------------");
        for (int i = 0; i < 5; i++) {
            System.out.print("값 변경 전 : " + "arr[i].a = " + arr[i].a + " " + "/" + " ");

            arr[i].a = 10 * i;
            System.out.println("값 변경 후 : " + "arr[i].a = " + arr[i].a + " ");

        }

        int j = 0;
        System.out.println();
        System.out.println("개선된 for문");
        for (ObjectOne i : arr) {
            System.out.print("값 변경 전 : " + "arr[i].a = " + i.a + " " + "/" + " ");

            i.a = 10 + j++;
            System.out.println("값 변경 후 : " + "arr[i].a = " + i.a + " ");

        }

        // 1번지의 주소값이 0번지에 담긴다
        arr[0] = arr[1];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0].a);
        System.out.println(arr[1].a);
        // 이렇게 되면 arr[0] 이 가지고있던 int a = 0, a(); 이 속성과 기능들이 가비지 컬렉션으로 가면서 사라진다

    }
}
