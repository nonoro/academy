package homework;

public class WhileGugudan {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
