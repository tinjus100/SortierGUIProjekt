package test;

import util.ArrayGenerator;

import java.util.Arrays;

public class TestArrayGenerator {
        public static void main(String[] args) {
                int n = 10;
                int max = 100;
                int[] a = ArrayGenerator.randomNumbers(n, max);
                System.out.println("Array: " + Arrays.toString(a));
                System.out.println("N == Länge des Arrays: " + ueberpruefeN(a, n));
                System.out.println("Max >= Maximalwert des Arrays: " + ueberpruefeMax(a, max));
                System.out.println("Keine Dopplungen: " + ueberpruefeDopplung(a));

                System.out.println();

                // n = 15;
                max = 15;
                a = ArrayGenerator.keineDopplung1(n, max);
                System.out.println("Array: " + Arrays.toString(a));
                System.out.println("N == Länge des Arrays: " + ueberpruefeN(a, n));
                System.out.println("Max >= Maximalwert des Arrays: " + ueberpruefeMax(a, max));
                System.out.println("Keine Dopplungen: " + ueberpruefeDopplung(a));

                System.out.println();

                // n = 15;
                max = 200;
                a = ArrayGenerator.keineDopplung2(n, max);
                System.out.println("Array: " + Arrays.toString(a));
                System.out.println("N == Länge des Arrays: " + ueberpruefeN(a, n));
                System.out.println("Max >= Maximalwert des Arrays: " + ueberpruefeMax(a, max));
                System.out.println("Keine Dopplungen: " + ueberpruefeDopplung(a));
        }

        public static boolean ueberpruefeN(int[] a, int n) {
                return a.length == n;
        }

        public static boolean ueberpruefeMax(int[] a, int max) {
                int b = 0;
                for (int i = 0; i < a.length; i++) {
                        if (a[i] > max) {
                                b++;
                        }
                }
                return b == 0;
        }

        public static int zaehle(int[] a, int gesucht) {
                int z = 0;
                for (int i = 0; i < a.length; i++) {
                        if (a[i] == gesucht) {
                                z++;
                        }
                }
                return z;
        }

        public static boolean ueberpruefeDopplung(int[] a) {
                int b = 0;
                for (int i = 0; i < a.length; i++) {
                        if (zaehle(a, a[i]) > 1) {
                                b++;
                        }
                }
                return b == 0;
        }
}



