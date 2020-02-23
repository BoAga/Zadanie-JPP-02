import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {

        int[] tab = {1, 12, 15, 17, 20, 6, 5};
        int max = findMaximu(tab);
        int min = findMinimum(tab);

        System.out.println(" Max: " + max + " Min: " + min);

    }

    private static int findMinimum(int[] tab) {
        int potentialMin = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < potentialMin)
                potentialMin = tab[i];
        }
        return potentialMin;
    }

    private static int findMaximu(int[] tab) {
        int potentialMax = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > potentialMax)
                potentialMax = tab[i];

        }
        return potentialMax;
    }






}





