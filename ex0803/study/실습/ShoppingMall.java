package ex0803.study.실습;

class ShoppingMall {
    public void inputAge(int age) throws ExceptionExam {

        if (age < 18) {
            throw new ExceptionExam("나이" + age + "살의 아이들은 안돼요~~" + "\n");
        }
            System.out.println("나이" + age + "살님 입장하신걸 환영합니다" + "\n");
    }
}
