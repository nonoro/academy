package ex0721;

class ArithmeticOperation {
    public void calculator(int number1, int number2, String arithmeticOperationSymbol) {
        int result;
        if (arithmeticOperationSymbol.equals("+")) {
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        } else if (arithmeticOperationSymbol.equals("-")) {
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (arithmeticOperationSymbol.equals("*")) {
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        } else if (arithmeticOperationSymbol.equals("/")) {
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else {
            System.out.println("연산기호가 잘못되었습니다.");
        }
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.21
  주제 : 사칙연산 version2 메소드
*/