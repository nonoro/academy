package homework;

public class GradeCard {
    public static void main(String[] args) {
        String myName = "권규정";
        int score = (int)(Math.random() * 56 + 45);
        int koreanScore = score;
        score = (int)(Math.random() * 56 + 45);
        int englishScore = score;
        score = (int)(Math.random() * 56 + 45);
        int mathScore = score;
        int totalScore;
        double averageScore;
        char grades;

        totalScore = koreanScore + englishScore + mathScore;
        averageScore = totalScore / 3;

        if (averageScore >= 90) {
            grades = 'A';
        } else if (80 <= averageScore & averageScore <= 89) {
            grades = 'B';
        } else if (70 <= averageScore & averageScore <= 79) {
            grades = 'C';
        } else if (60 <= averageScore & averageScore <= 69) {
            grades = 'D';
        } else {
            grades = 'F';
        }

        System.out.println("이름 :" + myName +
                           "\t\n국어점수 :" + koreanScore +
                           "\t\n영어점수 :" + englishScore +
                           "\t\n수학점수 :" + mathScore +
                           "\t\n총점 :" + totalScore +
                           "\t\n평균 :" + averageScore +
                           "\t\n학점 :" + grades);


    }
}