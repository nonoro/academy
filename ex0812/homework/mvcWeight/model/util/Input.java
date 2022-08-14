package ex0812.homework.mvcWeight.model.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return BR.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
