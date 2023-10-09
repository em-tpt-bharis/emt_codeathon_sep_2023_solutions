package codeFest;

import java.util.Arrays;
import java.util.Scanner;

public class Codeathon03_Harish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTrees = scanner.nextInt();
        int[] treeHeights = new int[totalTrees];
        for (int i = 0; i < totalTrees; i++) {
            treeHeights[i] = scanner.nextInt();
        }

        Arrays.sort(treeHeights);

        int maxTravelTime = 0;

        // Calculate maximum travel time for each starting tree
        for (int i = 0; i < totalTrees; i++) {
            int travelTime = 0;

            // Calculate travel time for clockwise direction
            for (int j = i + 1; j < totalTrees; j++) {
                travelTime += (j - i) * treeHeights[j];
            }

            // Calculate travel time for anti-clockwise direction
            for (int j = 0; j < i; j++) {
                travelTime += (totalTrees - i + j) * treeHeights[j];
            }

            maxTravelTime = Math.max(maxTravelTime, travelTime);
        }

        System.out.println(maxTravelTime);
    }
}
