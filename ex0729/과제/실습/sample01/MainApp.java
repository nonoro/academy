package ex0729.과제.실습.sample01;

public class MainApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        FullTime[] full = new FullTime[3];
        PartTime[] part = new PartTime[2];


        full[0] = new FullTime(10, "유재석", "개그우먼", 0, "2013-05-01", "무한도전", 8500, 200);
        full[1] = new FullTime(20, "박명수", "가수", 10, "2013-06-20", "무한도전", 7500, 100);
        full[2] = new FullTime(30, "정준하", "예능인", 10, "2013-06-22", "무한도전", 6000, 0);

        part[0] = new PartTime(40, "노홍철", "예능인", 20, "2014-05-01", "무한도전", 20000);
        part[1] = new PartTime(50, "하하", "가수", 30, "2014-05-02", "무한도전", 25000);

        //출력화면을 보고 코딩...
        System.out.println("**************************** FullTime 정보 *********************************");
        for (FullTime fullTime : full) {
            System.out.println(fullTime); // 인수로 객체가 오면 자동으로 객체.toString()자동 호출이되고 리턴하는 값을 출력한다.
        }                                 // 그래서 .toString()은 따로 안써도됨 자동으로 호출 따라서 얘는 fullTime.toString()이 출력됨
        System.out.println();

        System.out.println("**************************** PartTime 정보 *********************************");
        for (PartTime partTime : part) {
            System.out.println(partTime);
        }
        System.out.println();

        System.out.println("**************************** Message *********************************");
        for (FullTime fullTime : full) {
            fullTime.message();
        }
        for (PartTime partTime : part) {
            partTime.message();
        }


    }

}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : sample01
*/



