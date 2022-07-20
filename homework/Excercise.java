package homework;

// 1. 조건문 : if, switch
//    반복문 : for, while, do-while
// 2. 2번

class Excercise {
    public static void main(String[] args) {
        // 3. for문을 이용해서 1부터 100까지의 정수 중 3의 배수의 총합을 구하라
        System.out.println("3. for문을 이용해서 1부터 100까지의 정수 중 3의 배수의 총합을 구하라");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println();

        // 4. 두개의 주사위를 던져 합이 5이면 실행을 멈추고 아니면 계속 던지기

        System.out.println("4. 두개의 주사위를 던져 합이 5이면 실행을 멈추고 아니면 계속 던지기");
        int i = 0;
        while (i != 5) {
            int diceNumber1 = (int) ((Math.random() * 6) + 1);
            int diceNumber2 = (int) ((Math.random() * 6) + 1);
            i = diceNumber1 + diceNumber2;
            System.out.println("(" + diceNumber1 + "," + diceNumber2 + ")");
            if (i == 5) {
                System.out.println("두 개의 다이스의 합이 " + i + " 이므로 종료합니다");
            }
        }
        System.out.println();

        // 5. 중첩 for문을 사용하여 4x + 5y = 60의 모든 해를 구해서 (x, y)의 형태로 출력하시오 x, y는 10이하의 자연수
        System.out.println("5. 중첩 for문을 사용하여 4x + 5y = 60의 모든 해를 구해서 (x, y)의 형태로 출력하시오 x, y는 10이하의 자연수");
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (((4 * x) + (5 * y)) == 60) {
                    System.out.println("(" + x + "," + y + ")");
                } else {
                    continue;
                }
            }
        }
        System.out.println();

        // 6. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
        System.out.println("6. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print("*");
                if (j == k) {
                    break;
                }
            }
            System.out.println();
        }
    }
}