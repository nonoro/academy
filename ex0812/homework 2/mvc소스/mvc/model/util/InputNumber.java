package ex0812.homework.mvc소스.mvc.model.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return BR.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
