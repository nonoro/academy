package ex0725.과제.로또;

public class Lotto {
    int[] lottoNumber = new int[6];
    int[] tmp = new int[6];
    int count = 0;

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.getLottoNumber();
        lotto.printLottoNumber();
        System.out.println("중복값이 있어 다시 뽑은 횟수: " + lotto.count);
    }

    public void getLottoNumber() {
        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = (int) ((Math.random() * 45) + 1);

            // 중복처리
            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    i--;
                    count++;
                    System.out.println("중복값 존재");
                }

                // 내림차순
                if (lottoNumber[i] < lottoNumber[j]) {
                    int lottoNumberTemp = lottoNumber[i];
                    lottoNumber[i] = lottoNumber[j];
                    lottoNumber[j] = lottoNumberTemp;
                }

            }
        }
    }

    public void printLottoNumber() {
        System.out.print("로또번호: ");
        for (int i : lottoNumber) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.25
  주제 : 로또(중복제거, 오름차순)
*/

