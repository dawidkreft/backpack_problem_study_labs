package pl.kreft.algorytmy;

public class Rekurencja {

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int execute(int BackWeight, int wt[], int val[], int n) {

        if (n == 0 || BackWeight == 0)
            return 0;

        if (wt[n - 1] > BackWeight)
            return execute(BackWeight, wt, val, n - 1);

        else return max(val[n - 1] + execute(BackWeight - wt[n - 1], wt, val, n - 1),
                execute(BackWeight, wt, val, n - 1)
        );
    }
}
