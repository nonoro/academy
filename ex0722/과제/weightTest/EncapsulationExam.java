

class EncapsulationExam {
    private int weight = 76;
    private int password = 123456;

    public void getSearchWeight(int pwd) {
        if (isCheckPassword(pwd)) {
            System.out.println("몸무게 > " + weight);
        } else {
            System.out.println("비밀번호 불일치");
        }
    }

    public void getApendWeight(int wt, int pwd) {
        if (isCheckPassword(pwd)) {
            weight = wt;
        }
    }

    public void getApendPassword(int pwd, int newPwd) {
        if (isCheckPassword(pwd)) {
            password = newPwd;
        }
    }

    private boolean isCheckPassword(int pwd) {
        if (password == pwd) {
            return true;
        } else {
            return false;
        }
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.22
  주제 : 몸무게과제 메소드 클래스
*/