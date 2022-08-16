package test.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine(String message) {
        try {
            System.out.print(message);
            return BR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
