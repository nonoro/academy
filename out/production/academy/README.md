# 22.07.18

## 자바 시작하기
- 자바 Sun 에서 시작
- 1991년에 오크라는 이름으로 전자제품에 들어가는 SW로 시작
- 1995년에 자바 라는 이름으로 재 탄생
- 2011년에 Oracle사에서 인수 --> oracle.com
- 운영체제에 독립적
- 객체지향적

## 환경세팅
1) JDK(Java Development Kit)설치 - oracle.com에서 다운로드
   - open JDK
     - Azulu, Adopt, 레드헷

   - java version
     - java 18
     - java 17
     - java 11 - 선택!!!
     - java 8
2) 코딩을 위한 tool 준비
   - 메모장
   - 에디터플러스
   - IDE : 통합개발환경
     1) 이클립스 - eclipse.org 수업은 요걸로 
     2) 인텔리제이

3) path설정
   - C:\Program Files\Java\jdk-11.0.15\bin 폴더를 설정을 잡는다
   - 이유 : 컴파일(javac.exe),실행(java.exe) 할때 필요한 명령어를 위치에 상관없이 사용할 수 있도록 설정이 필요

# 22.07.19

## Java
1. 객체(Object) = 속성(Field = 전역변수 = 멤버필드) + 기능(메소드) 
2. 기본적인 틀 (클래스 + 변수 + 메소드)(붕어빵 기계)
```
-------------------------------------~~~~~.java-------------------------------------------

        class Test {            // 클래스이름의 첫 글자는 반드시 대문자
                                // 파일명의 이름은 클래스명과 반드시 같아야한다
              속성;              // 속성과 메소드의 이름의 첫글자는 소문자 
              method(){}        // 메소드는 괄호도 같이 붙는다 
        }                
        
------------------------------------------------------------------------------------------        
```
=> 위에.java파일은 실행파일이 아니고 붕어빵기계처럼 붕어빵을 찍어낼 수 있는 파일임

=> 실행하기 위해선 클래스파일로 만들어야됨

1) 컴파일 => 소스의 문법적인 오류를 체크 하는 단계 => 오류가 없으면 .class라는 바이트코드로 된 파일 생성 => javac.exe라는 실행파일로 컴파일함(bin이라는 폴더 안에 있음)
 => 따라서 javac 파일이름.java + 엔터 이렇게 하면 컴파일 되고 test.class라는 실행파일이 생성된다. 
2) 실행 => 실행시 java.exe에서 exe를 생략 => 따라서 java 파일이름.class로 실행 근데 class도 안씀 => 결론 java 파일이름 으로 실행 
=> 실행은 메인메서드에서 호출하는 호출순서에따라 실행된다 위에서 부터 순차적으로 실행이 아님 근데 오류는 뒤에서부터 아래까지 순차적으로 찾아서 알려줌 
3) JDK11(실행 + 컴파일할때 필요) >
     - JRE(실행환경 구축, 실행만할거면 얘만 있어도됨) >
       - API(Application Programming Interface : class들의 묶음) >
         - JVM(메모리관리, 실행파일을 하드웨어에 올려서 실행될 수 있도록 하는 역할(운영체제에 상관없이 올려주는역할))

- ***컴파일언어*** : java파일의 처음부터 끝까지의 오류를 전부 체크해서 마지막에 오류를 띄워주는것 ex) 자바(얘는 인터프리터의 특징도 가지고있음)
- ***인터프리터 언어*** : 한줄해석하고 오류띄워주고 한줄해석하고 오류띄워주는 순차적으로 오류를 체크하는 언어 ex) 자바스크립트, 자바
- ***자바는 호출순서로 실행됨 따라서 컴파일 순서와 실행 순서는 다름***

* Java의 과정 정리
 - ~~~.java => ~~~ javac.exe => ~~~ java.class (byte코드로 된 실행파일) => java.exe(JVM, 실행) => 실행 완료
## 자바분야
1. 응용 - Java SE
2. 웹 - Java EE
3. 모바일 - Java ME

## 자바의 변천사 = 역사
- Java는 기본적으로 웹에서 돌아가는 프로그램을 작성할 수 있다 : Applet
  - ~~.java로 작성을해서 ~.html문서를 만들어 <applet clas=""/>를 이용해서 브라우져에서 실행할 수 있다.  
    - 2000년대 전에... 사용을 했다. : 얘는 완벽하게 자바로 작성해서 실핸만 html로 하는 것으로 자바를 모르면 할 수 없다.
      개발자와 디자이너 간의 협업이 어렵다.
      - 2000대에 오면서 웹의 시장의 확장!!! 
        - 이러면서 Servlet이 탄생!!
        - Servlet은 ~.java문서안에 html, css, javaScript를 그대로 사용할 수 있다.
        - 확장자가 java기 때문에 컴파일하고 실행이라는 단계를 진행 해야하기 때문에 디자이너들이 쉽게 사용하기 어렵다
        - 이시기에 웹의 규모는 작으면서 빠르게 웹을 개발해야하는 시기로 더 쉽게 작성할 수 있는 Asp또는 php에 비해 인기가 없다.
        - 그래서, 자바시장에서 asp와 php와 비슷한 JSP를 탄생!!!
  
  - JSP는 마크업중심의 코드안에 자바코드를 사용한다. : 디자이너들이 쉽게 디자인 할 수 있어서 협업이 좋다.
        * 한동안 JSP 로 빠르게 웹을 개발을 하였으나 유지보수와 확장성, 생산성의 어려움을 요즘은 디자인패턴을 적용한 개발을 한다.
  - 결론) : MVC구조 개발 - 생산성, 유지보수, 확장성, 협업, 표준화 등등이 가능하도록...
    1) Model : Java(Service, DAO, Repository, DTO = VO = Domain....)
    2) View : HTML, CSS, javaScript, jQuery, JSP
    3) Controller : Servlet

- ex 사용자 이름 선언
  1) 클래스 -> UserName
  2) 메소드 -> userName()
  3) 변수 -> userName
  4) 상수 -> USER_NAME
  
    - 유니코드 \uxxxx -> ex) a
    - String str = "안녕"

```
class String {
    속성
    메소드(){}
}
```
- int i = 정수형 숫자; 
- char ch = '한문자';
- double d = 실수형;
- HelloTest t = HelloTest객체;
- 변수를 쓰는 이유 : 입력값이 바뀌었을때 결과값에 영향을 주기 위해서

- int ex) 
  1) 5/2 = 2 int타입끼리의 계산이라 결과값이 int타입
  2) 5/2.0 = 2.5 int보다 double이 더 커서 double타입으로 결과값이 나옴
  3) 계산시 큰형태로 결과값이나옴
- =, == 연산자
  1) a==b -> a와 b가 같다.
  2) a=b -> a에 b의 값을 넣어라(대입한다)
  3) a+=b -> a = a + b
- |와 ||비교 = or
  1) ex) true | ? -> true
  2) ex) true || ? -> true : 주기가 짧은 연산자라고 해서 앞에서 답이 나오면 뒤에는 실행하지 않고 결과를 낸다.

- &와 &&비교 = and
  1) ex) false & ? => false
  2) ex) false && ? => fasle : 앞에서 이미 결과가 나왔기 때문에 뒤(?) 부분을 실행하지 않고 결과를 낸다.

- 증감연산자
  1) ++
     1) ex) a++ : 선대입 후 증가
     2) ex) ++a : 선증가 후 대입
  2) --
     1) ex) a-- : 선대입 후 감소
     2) ex) --a : 선감소 후 증가
     
  3) ex) int a = 5
  ```
  System.out.println(--a); // 4
  System.out.println(a--); // 5
  ```
- 문자열 + 숫자 : 문자열
  1) "A"  + 2 = A2라는 String이다.
  2) (char)'A' + 2 = 숫자 int형 결과 나온다.
  3) 중요 : String(문자열)은 - 연산은 할 수 없음

- 조건 삼항 연산자
   1) 조건식 ? 조건식결과 참일경우 : 조건식결과 거짓일경우
   2) long seed=0;
      Random r = (seed==0) ? new Random() : new Random(seed);
- ^ : XOR연산자 : 같으면 false 다르면 true
- \t, \n, \b, \r


## 형변환(객체타입은 Promotion이나, Casting을 안한다)
1) Promotion : 작은 Type이 큰 Type으로 변경(자동으로 이루어짐)
2) Casting : 큰 Type이 작은 Type으로 변신 ( 절대 자동아님 - Casting연산자이용 )( =을 기준으로 왼쪽에는 할 수 없음 )
3) 객체 형변환 예시
   - 5 -> "5" --> String s = Integer.toString(5);
   - "5" -> 5 --> int i = Integer.parseInt("5");
   - 단 객체 캐스팅된다? : 상속관계에 있을때만 캐스팅 할 수 있다!!
     - 부모 > 자식
       - 자식을 부모타입에 담을 수 있다. = Promotion(자동)
       - 부모를 자식타입에 담을 수 없다. = 캐스팅 연산자를 이용해서 할 수 있다.(ObjectDownCasting)

   - int a = 3;
   - double d = 3.2;
- double b = d; // 자동 = promotion이다.
- int k = (int)d; // 오류이기 때문에 캐스팅연산자를(int) 이용해서 형변환이 필요하다
- byte a=5, b=3;
  - byte c = a+b; // 컴파일오류발생 a+b가 8비트가 넘음 
  - 연산기호를 만나면 무조건 4바이트의 공간이 필요하고 그래서 결과값이 int 값으로 바뀌기 때문에 byte연산시 주의 byte short 

# 제어문
1) 조건문
   - if문
   - switch문
2) 반복문
   - for문
   - while문
   - do while문


- if문의 구조
```
if(조건식) { // 조건식의 결과는 반드시 boolean형이다
  // 실행문장
}
---------------------------------------------------------------------
if(조건식) {
  // 조건식이 true일때 실행문장;
}else {
  // 조건식이 false일때 실행문장;
}
---------------------------------------------------------------------
if(조건식) {
    // 실행문장(1)
} else if(조건식) {
    // 실행문장(2)
} else if(조건식) {
    // 실행문장(3)
} ...
else { 
    //  그 밖의 모든 경우에 실행문장;
}
```

* 난수발생 : 임의의 수를 발생 
  - double nansu = Math.random(); // 0.0 ~~ 0.99999 
  - 1 ~ 5 사이의 숫자를 발생하고 싶다!!! 
    - (Math.random() * 경우의 수) + 최소값;
      - ex) (Math.random() * 5) + 1;
  - 25 ~ 45 사이다
    - (Math.random()*21) + 25;
  - double d = (Math.random() * 5) + 1;
  - int convertNo = (int)(Math.random() * 5) + 1;

# 22.07.20
- 2장 확인문제 
  - 1번
    - 4번이 답인데 명시적초기화도 있지만 자동으로 초기화해주기도 함 
      ```
      int i; 
      System.out.println(i); 이렇게하면 오류뜸 이런 경우에는 명시적으로 초기화를 해줘야함
      /* 명시적 초기화
      int i = 0;
      ```
  - 3번
    - char타입은 문자가 들어가기도 하지만 숫자도 들어가기 때문에 2byte의 정수타입으로도 볼 수 있다
  - 4번
    - 리터럴 : 그 안에 실제로 들어가 있는 값
  - 5번 
    - short shortValue = 'A'를 하면 들어가는데 short shortValue = char charValue 하면 안들어가는 이유 : 이 두가지 경우는 다른 경우임
      - short 타입과 char 타입이 같은 100자리의 사이즈를 가지고 있더라도 short타입은 -의 공간을 가지고 있고 char는 -의 공간이 없기 때문에 
      - char값을 담을 수 있는 공간이 50개 밖에 없어서 값을 넣는것이 아니면 못들어간다
  - 6번 
    - String은 객체라서 캐스팅이 안되고 특정 메소드를 사용해야함
  - 7번
    - 답 3번임 
      - 이유 : char타입은 문자를 뭐라도 하나 넣어야함 그래서 char = '';이렇게 하면 안됨 char = ' '; 이렇게 공백이라도 하나 줘야 오류가 안뜸
        - But String은 String = ""; 이렇게 해도 됨 
- 성적표 만들기
  - if문 작성시 && 로 범위표시 다 할 필요 없음
    - 이번 과제의 경우 score >= 90 했으면 아래서 80 <= score && score <= 89 이렇게 하지말고 score >= 80 이렇게 그냥 하면됨 위에서 어짜피 90보다 작아서 내려왔기 때문임

## 조건문 
1. if문
2. switch문

- switch문의 구조
```
switch(표현식) { // 표현식은 조건대상
    case 값 : 문장; break;
    case 값 : 문장; break;
    case 값 : 문장; break;
    ...
    default : 문장;
}
```

  - switch문은 break가 없으면 {} 안에 모든 케이스가 실행됨 그래서 break를 걸어줘야됨
  - 표현식에 올 수 잇는 데이터 타입
    - byte, short, char, int, String, = java 1.7version이상가능
  - switch문은 정확하게 일치하는 값을 비교할 수 있고 값의 범위를 조건으로 비교할 수 없음 그 때에는 if문 사용

## 반복문
1. for문 - 가장 많이 씀
2. while문
3. do while문

- for문 구조
```
    for( ; ; ) { // 무한반복 문장
        문장;
    }
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    
    for ( 초기화; 조건식; 증감식 ) {
        문장;
    }
```
    
- 실행순서
  - 초기화 - 조건식(true일 경우) - 문장 - 증감식 - 조건식 - 문장 - 증감식 - 조건식 - 문장 - 증감식 이런식으로 조건식 의 범위에서 계속 반복
  - 만약 조건식이 false면 for문이 동작하지 않고 for문을 빠져나감
  - 꼭 증가하는건아니고 감소도가능 그리고 1씩 증감이 아닌 10 100도 증감시킬 수 있다.

- 2중 for문
```
    for (초기화; 조건식; 증감식) {
        for (초기화; 조건식; 증감식) {
            실행문장
        }
       
    }
```

- 실행순서 
  - (바깥쪽포문) -> 초기화 - 조건식 - (여기서 조건식 false뜨면 전체 포문 탈출) - (안쪽포문) -> 초기화 - 조건식 - (여기서 조건식 false뜨면 바깥쪽 포문으로 탈출 하고 바깥쪽 포문의 증감식으로 갔다가 다시 조건식으로 감) - 실행문장 - 증감식 - 실행문장
  - 정리 : 바깥쪽 포문이 1번도는 동안 안쪽 포문은 조건식의 범위만큼 돌고 다 돌고나면 다시 바깥쪽 포문이 2번째 돌고 다시 안쪽포문이 돌고 이런 형태
- 포문은 조건식과 초기값을 활용 할 수 도 있지만 그건 그냥 반복을 위한 도구일 뿐이고 포문안에 다른 문장들을 넣어서 기능을 구현할 수 있음을 명심!

## while, do-while문
1. while문
- while문의 구조
```
    초기화;
    while(조건식) {
        증감식;
        실행문장;
    }
    
    * while문은 증감식과 실행문장의 순서를 바꿀 수 있다.
    
    while(true) { // 무한루프
    
    }   
    
    -----------------------------------------------------
    초기화;
    while(조건식) {
        증감식;
        실행문장;
        
        초기화;
        while(조건식) {
            증감식;
            실행문장;
        }
    }
```

2. do-while문
```
초기화;
    do {
        문장;
        증감식;
    } while(조건식)
    
    * 문장과 증감식은 순서를 변경할 수 있다.
    * 조건식이 아래에 있어 무조건 한번은 문장을 실행한다.
-----------------------------------------------------------------
        초기화;
    do {
    
        초기화;
        do {
        문장;
        증감식;
        } while(조건식);
        
        문장;
        증감식;
    } while(조건식)
```

- break 와 continue
  - 공통점 : 둘다 문장이 실행되다가 얘내를 만나면 그 다음 문장을 실행하지 않음
  1) break : 감싸고 있는 반복문을 빠져나옴
  2) continue : 반복문 안에서 continue가 위치한곳에서 그 다음 아래 문장을 실행하지 않고 위로올라가서 다음횟수의 반복문을 수행한다


# 22.07.21
- 확인문제풀이
- 선생님 별찍기 코드
```
class StarExam {
    public static void main(String[] args) {
        for (int a = 1; a <=5; a++) { // 5행
        //공백
            for (int b = a; b < 5; b++) {
                System.out.print("☆");
            }
            //별
            for (int c = 1; c <= a; c++) {
                System.out.print("★");                
            }
            System.out.println();
        
        }
            
    }
}
```

## 메소드
1. 객체 안에 선언되어 객체가 가지고 있는 기능이다.
2. 반드시 class내부에 선언된다.
3. 호출해서 사용한다(호출되기 전 실행 안됨.)
4. 재귀호출가능(자기 자신 안에서 자신을 호출)
5. 메소드 마지막 구현부에서 return 할 수 있다.(특정 값을 호출한 주체에게 return한다)
6. 재사용 목적 - 코드의 중복을 피할 수 있다
- Method 작성법
- ***modifiers*** ***return_type*** ***method이름(DataType 변수이름, DataType 변수이름, ...) { 기능 }*** : modifiers ~ () 까지 선언부 {}는 구현부
  - modifiers(제한자) : 0개 이상 올 수 있다
    - 제한자(접근제한자랑 일반제한자의 순서를 바꿔도되지만 일반적으로는 접근제한자가 먼저나옴)
      1. 접근제한자(access modifier) : 얘는 4개중 무조건 1개를 써야됨
         1) pubilc : 어디서나 아무나 접근가능
         2) protected : 상속관계자면 어디서나(폴더) 접근가능
         3) 아무것도없음 : 같은 폴더 내에서 아무나 접근가능 
         4) private : 하나의 class 내에서만 접근가능
      2. 일반 제한자 : 얘는 써도 되고 안써도됨
         5) static
         6) final
         7) abstract
         8) synchronized
    - return type : 반드시 한개 작성 - 생략불가 : return은 메소드가 끝날때 가지고 나오는 값이다.
      1. 기본형 8가지중 1개 : 반드시 구현부 마지막 줄에 ***return 가지고 갈 값이 나와야함***
      2. object 타입 중 1개 : 반드시 구현부 마지막 줄에 ***return 가지고 갈 값이 나와야함***
      3. void : 리턴값이 없다
    - method 이름
    
    - () : 인수 = parameter = 아규먼트 = 매개변수 : 메소드를 호출하는 사람이 들고오는 값을 받을 변수를 선언하는 곳
```
 class ____ {
    public 일반제한자 커피 자판기(int 돈) {
     ---------------기능----------------
     return 실제 커피라는 값;
   }
 }
 
 class 커피 {
 }
```

- 메소드 호출방법
  1. static이 붙은 메소드 호출방법
     1. ***class이름.method이름(인수, 인수, ..);***
     ```
     class Test {
        public void aa() {
     
        }
     
        public int bb(String s) {
            // 기능
        }
     
        public static void cc(int i) {
        
        }
     
        protected static double dd(String s) {
     
        }
     
     }
        다른클래스에서 호출
     Test.cc(5); // static메서드라서 바로 호출가능
     double a = Test.dd("o"); // static메서드라서 바로 호출 가능
     Test t = new Test();
     t.aa(); // static메서드가 아니라서 객체를 생성한뒤 호출 가능
     t.cc(33); // static메서드임에도 객체를 만들어서 호출 가능 근데 이렇게 잘 안함
     ```
     2. static 메소드안에서는 논static은 못씀 그래서 함부로 쓰면 안됨 계속 static을 써야됨
  2. 같은 class 내부에서 method 호출
     - ***this.method이름(값, 값, ...)***(this는 생략도 가능)
  3. 가장 일반적인 방법
     1. 호출하려는 method를 감싸고 있는 class를 생성한다(객체생성 : new)
     2. 객체생성방법
        - class이름 변수이름 = new class이름(); // 이 경우 객체는 힙이라는 곳에 저장되어 있고 변수이름에는 변수이름이 저장된 힙을 가르키는 HashCode라고 하는 주소값이 저장된다
        - 주소값 : 클래스이름@hashcode
        - 만약 객체변수인 변수이름을 print로 출력하면 주소값이 출력됨 그건 toString()에 주소값이 출력되도록 되어있기 때문에 toString()을 오버라이딩해서 리턴값을 바꿔서 객체의 속성, 기능이 뜨게 할 수 있음
        - 생성된 객체변수를 이용하여 method를 호출한다
          - 방법 : ***변수이름.method이름({값, 값, ....})***
  ```
  class Test {
        public void aa() {
            기능;
     }
        public int bb() {
            기능;
            return 5;
     }
        public String cc(int i) {
            기능;
            return "배고프다";
     } 
  }
  
  
  class MainApp {
    public static ~~~~~ () {
            Test test = new Test(); 
            test.속성;
            test.method이름(값, 값, ...);
            test.aa(); // 얘는 return값이 없는 메서드를 호출했기 때문에 메서드가 실행되고나서 끝나면 다시 그냥 호출했던 위치로 되돌아오고 다음 메서드가 실행
            int b = test.bb(); // 얘는 return값이 있음 그래서 메서드 호출하고 메서드 실행된 뒤 리턴이 5니까 5가 이 호출한 자리로 오게된다. 
                                // 그 경우 5를 받아줄 바구니(int b)를 선언해줘야된다 근데 5를 받고 싶지 않으면 그냥 바구니 생성안하면 안받고 다음걸로 넘어감
            String str = test.cc(3); // 얘도 마찬가지로 리턴값을 받고싶으면 이렇게하고 아니면 그냥 test.cc(3);하고 리턴값 버려도됨
     }
  }
  ```

- double d = Math.random(); // 0.0 ~ 0.999
```
class Math {
public static double random() {
// 기능;
return 실수값
}
}
```
- 문자열을 숫자로 변환하는 메소드
  - int i = Integer.parseInt("10");
- 숫자를 문자열로 변환하는 메소드
    - String s = Integer.toString(5);
```
class Integer {
    public static int parseInt(String str) {
        // 기능
    return 숫자값
    }
    public static String toString(int number) {
        // 기능
    return 문자열값
    }
}	
 ```
- public class는 한 개 만 작성 가능하다.
- public class가 있을 경우 반드시 public class이름으로 파일명을 지정한다.
- public class안에 main method 작성한다.
- class앞에 modifier가 올 수 있는데 접근제한자 중 public or 생략 두가지 중 한가지만 사용가능
  - But 클래스 안에 클래스에는 private사용가능

- nextLine 사용시 주의사항
  - 스캐너 사용시 nextInt()로 숫자를 입력하면 만약 50을 입력했다치면 버퍼라는 곳에 50과 \n이 같이들어간다
  - 보통 next()나 nextInt() 는 공백을 인식하지 않기 때문에 50이라는 값만 쏙 뽑아서 가서 다음게 진행되지만
  - 얘내가 뽑아가면서 남아있는 \n들은 남아있다 그래서 얘내가 실행된 후에 nextLine() 을 실행하게되면 얘는
  - 공백을 인식하기 때문에 버퍼에 있는 \n들을 뽑아내면서 다음걸로 넘어가게 된다 그래서 내가 원하는 값들을 입력할수가 없는데
  - 그럴 경우 위에 scanner.nextLine(); 이걸 한줄 넣어서 버퍼를 초기화해주거나 아니면 전부 다 nextLine()으로
  - 해서 숫자인경우 Integer.parseInt(scanner.nextLine())으로 숫자로 변환하여 넣으면 된다
