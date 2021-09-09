package Tugas;

import java.util.Arrays;
public class dragon {
    public static void main(String[] args) {
        int[] Knight = { 4, 3, 1, 2};
        int[] naga = { 7, 2 };
        Arrays.sort(Knight);
        Arrays.sort(naga);
        int varDragon = 5;
        int power = 7;
        for (int i : Knight) {
            if (varDragon < naga.length) {
                if (i >= naga[varDragon]) {
                    power += i;
                    varDragon++;
                }
            }
        }
        if (varDragon == naga.length) {
            System.out.println("Minimum Power : " + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}

