import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_N = 20;

    public static int n;
    public static int[][] grid = new int[20][20];

    public static int getNumOfGold(int rowS, int colS, int rowE, int colE) {
        int numOfGold = 0;

        for (int row = rowS; row < rowE; row++) {
            for (int col = colS; col < colE; col++) {
                numOfGold += grid[row][col];
            }
        }

        return numOfGold;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxGold = 0;
        
        n = scanner.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                grid[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row + 2 >= n || col + 2 >= n) {
                    continue;
                }

                int numOfGold = getNumOfGold(row, col, row + 2, col + 2);
                
                maxGold = Math.max(maxGold, numOfGold);
            }
        }

        System.out.println(maxGold);
    }
}