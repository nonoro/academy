package ex0721;

public class ScoreCalculator {
    public static final int NUMBER_OF_SUBJECTS = 3;

    public void printResult(String name, int korScore, int engScore, int mathScore) {
        int totalScore = getTotalScore(korScore, engScore, mathScore);
        int averageScore = getAverageScore(totalScore, NUMBER_OF_SUBJECTS);
        String grade = getGrade(averageScore);

        System.out.println("이름 > " + name);
        System.out.println("총점 > " + totalScore);
        System.out.println("평균 > " + averageScore);
        System.out.println("등급 > " + grade);
    }

    private int getTotalScore(int korScore, int engScore, int mathScore) {
        return korScore + engScore + mathScore;
    }

    private int getAverageScore(int totalScore, int numberOfSubjects) {
        return totalScore / numberOfSubjects;
    }

    private String getGrade(int avgScore) {
        int averageScore = (int) (avgScore * 100) / 100;

        switch (averageScore / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.21
  주제 : 성적표 version3 메소드
*/
