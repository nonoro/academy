package test;

import test.controller.WeightController;

public class Main {
    public static void main(String[] args) {
        WeightController controller = new WeightController();

        while (controller.run()) { }
    }
}
