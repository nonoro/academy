package ex0804.study.collection;

import java.util.*;
class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d%d%n",20,30);
		System.out.printf("%d , %d%n",20,30);
		System.out.println();
		System.out.printf("가격 : %,d원%n",25320000);
		System.out.printf("%5.2f%n",35.33333);
		System.out.println();
		System.out.printf("%d년  %d월 %d일%n",2009,5,3);
		System.out.printf("%2$d년 %3$d월 %1$d일%n",1, 2005, 3);

		Calendar now = Calendar.getInstance(); // 현재 날짜와 시간을 가져온다
		System.out.println("now = " + now);

		System.out.println("\nYear=>"+now.get(Calendar.YEAR));
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) );
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n");
// $이거 잘 활용하기 1$는 , 뒤에 변수로 넣어줄 변수들중 1번째 변수를 뜻함
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 : %1$tM분 : %1$tS초%n" , now); // tY tm td tH 이건 고정임
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","장희정",20); // - 는 글자기준 오른쪽을 숫자만큼 띄우는거
		System.out.printf("%3d %-10s %-8s %-5d%n",22,"hee","정효욱",03); // + 는 글자기준 왼쪽을 숫자만큼 띄우는거
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","장정희",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","장희정",20);
	}
}
