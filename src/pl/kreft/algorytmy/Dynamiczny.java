package pl.kreft.algorytmy;

public class Dynamiczny {

    public static int execute(int W, int wt[], int val[], int n) {
        int actualWeight;
        int resultMatrix[][] = new int[n + 1][W + 1];


        for (int indeks = 0; indeks <= n; indeks++) {
            for (actualWeight = 0; actualWeight <= W; actualWeight++) {

                if (indeks == 0 || actualWeight == 0) {
                    resultMatrix[indeks][actualWeight] = 0;

                } else if (wt[indeks - 1] <= actualWeight) {
                    resultMatrix[indeks][actualWeight] = Math.max(
                            val[indeks - 1] + resultMatrix[indeks - 1][actualWeight - wt[indeks - 1]],
                            resultMatrix[indeks - 1][actualWeight]);
                }
                else {
                    resultMatrix[indeks][actualWeight] = resultMatrix[indeks - 1][actualWeight];
                }
            }
        }

        return resultMatrix[n][W];
    }
}
