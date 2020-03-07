package pl.kreft.algorytmy;

public class BruteForce {

    public int execute(int W, int wt[], int val[], int n) {
        int pow = (int) Math.pow(2, n);
        int maxValue = 0;

        for (int j = 0; j < pow; j++) {
            int tempValue = 0;
            int tempWeight = 0;
            int[] tab = prepareArray(n, j);


            for (int i = 0; i < val.length; i++) {
                tempValue = tempValue + val[i] * tab[i];
                tempWeight = tempWeight + wt[i] * tab[i];
            }

            if (maxValue < tempValue && tempWeight <= W) {
                maxValue = tempValue;
            }

        }
        return maxValue;
    }

    private int[] prepareArray(int len, int x) {
        int result[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            int mask = 1 << i;
            result[len - 1 - i] = (x & mask) != 0 ? 1 : 0;
        }
        return result;
    }
}
