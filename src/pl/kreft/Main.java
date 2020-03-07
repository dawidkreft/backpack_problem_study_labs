package pl.kreft;

import pl.kreft.algorytmy.BruteForce;
import pl.kreft.algorytmy.Dynamiczny;
import pl.kreft.algorytmy.Rekurencja;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        int items = 3;
        int maxSize = 50;

        int val[] = new int[]{60, 100, 120, 140, 160, 200, 220, 240, 260, 300, 320, 360, 400, 440, 480, 500, 540, 580, 620, 650, 700};
        int wt[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220};
        int W = 10000;
        int n = val.length;

        BruteForce bruteForce = new BruteForce();

        Rekurencja rekurencja = new Rekurencja();

        System.out.println("REKURENCJA");

        Instant start = Instant.now();
        System.out.println("Wynik :" + rekurencja.execute(W, wt, val, n));
        Instant end = Instant.now();
        long time = Duration.between(start, end).toMillis();
        System.out.println("Czas rekurencji : " + time + "ms");


        System.out.println("BRUTE FORCE");
        start = Instant.now();
        System.out.println("Wynik: " + bruteForce.execute(W, wt, val, n));
        end = Instant.now();
        time = Duration.between(start, end).toMillis();
        System.out.println("Czas brute-force : " + time + "ms");

        Dynamiczny dynamiczny = new Dynamiczny();
        System.out.println("Dynamiczny");
        start = Instant.now();
        System.out.println("Wynik: " + dynamiczny.execute(W, wt, val, n));
        end = Instant.now();
        time = Duration.between(start, end).toMillis();
        System.out.println("Czas dyn : " + time + "ms");
    }


}
