package com.company.lesson5;

import java.util.Scanner;

public class SmartGarland {
    public static void main(String[] args) {
        int kol = 10;
        int garland = 78;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во итераций: ");
        if (s.hasNextInt()) {
            kol = s.nextInt();
        }
        chooseMod(garland, s, kol);
    }

    private static void chooseMod(int garland, Scanner s, int k) {
        System.out.println("Введите значение от 1 до 3: ");
        if (s.hasNextInt()) {
            int mode = s.nextInt();
            switch (mode) {
                case 1:
                    Blink(garland, k);
                    break;
                case 2:
                    runstring(garland, k);
                    break;
                case 3:
                    CurrentState(garland);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    static void Blink(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = ~g;
            CurrentState(g);
        }
    }

    static void runstring(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = g << 1;
            CurrentState(g);
        }
    }

    private static void CurrentState(int garland) {
        System.out.printf("%32s\n", Integer.toBinaryString(garland));
    }
}
