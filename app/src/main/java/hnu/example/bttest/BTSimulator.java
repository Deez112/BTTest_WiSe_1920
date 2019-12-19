package hnu.example.bttest;

import java.util.Random;

public class BTSimulator {
    public static int INTERVALL_MS = 1000; //simulate data every 1000ms

    public static String simulateValue() {
        Random rand = new Random();

        String prefix;
        String postfix=";";
        int value;

        if (rand.nextBoolean()==true) {
            value = rand.nextInt(150); // Obtain a number between [0 - 149].
            prefix= "V";
        } else {
            value = rand.nextInt(70); // Obtain a number between [0 - 69].
            prefix= "T";
        }
        return prefix+value+postfix;
    }
}
