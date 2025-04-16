import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[5][5];
        int top = 0;
        int bottom = 4;
        int left = 0;
        int right = 4;
        int num = 2;

        for (int i = 0; i < 5; i++) {
            arr[i][0] = 1;
            arr[0][i] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = num++;
            }
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
