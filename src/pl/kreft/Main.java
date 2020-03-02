package pl.kreft;

import pl.kreft.brute_force.BruteForce;
import pl.kreft.common.Algorithm;

public class Main {

    public static void main(String[] args) {
        Algorithm bruteForce = new BruteForce(10,6);
        System.out.println(" Wynik: " + bruteForce.execute());
    }
}
