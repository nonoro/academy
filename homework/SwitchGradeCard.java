package homework;

public class SwitchGradeCard {
    public static void main(String[] args) {
        String myName = "권규정";
        int score = (int) (Math.random() * 56 + 45);
        int koreanScore = score;
        score = (int) (Math.random() * 56 + 45);
        int englishScore = score;
        score = (int) (Math.random() * 56 + 45);
        int mathScore = score;
        int totalScore;
        int averageScore;
        char grades;

        totalScore = koreanScore + englishScore + mathScore;
        averageScore = (int) ((totalScore / 3.0) * 100) / 100;

        switch (averageScore/10) {
            case 10:
            case 9:
                grades = 'A';
                break;
            case 8:
                grades = 'B';
                break;
            case 7:
                grades = 'C';
                break;
            case 6:
                grades = 'D';
                break;
            default:
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

