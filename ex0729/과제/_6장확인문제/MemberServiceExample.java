package ex0729.과제._6장확인문제;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "1234");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제15
*/
