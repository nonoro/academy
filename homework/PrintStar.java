package homework;

public class PrintStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("★\t");
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("******************************************");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("★\t");
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("******************************************");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j == i) {
                    for (int k = i; k <= 5; k++) {
                        System.out.print("★\t");
                    }
                    break;
                }
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("******************************************");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if (i == j) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print("★\t");
                    } continue;
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
