package pl.kreft.brute_force;

import pl.kreft.common.Algorithm;

public class BruteForce implements Algorithm {

    int n; // liczba przedmiotów
    int u; // maksymalna waga plecaka
    int weight[];
    int values[];

    public BruteForce(int n, int u) {
        this.n = n;
        this.u = u;

        weight = new int[n];
        values = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = i +1;
            values[i] = i+1;
        }
    }

    @Override
    public int execute() {
        int W = 0;
        int sztuk = 0;
        for (int i = 0; i < n; i++) {
            sztuk = u / weight[i];
            u -= sztuk * weight[i];
            W += sztuk * values[i];
        }
        return W;
    }
}
