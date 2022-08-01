package ex0729.과제._6장확인문제;

// Exam15

public class MemberService {

    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("1234")) {
            return true;
        }
        return false;
    }

    public void logout(String id) {
        System.out.println(id + "이/가 로그아웃 되었습니다.");
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제15
*/
