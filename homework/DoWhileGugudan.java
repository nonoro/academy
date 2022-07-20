package homework;

public class DoWhileGugudan {
    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        } while (i <= 9);

    }
}
