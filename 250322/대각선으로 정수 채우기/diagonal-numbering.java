import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] answer = fillDiagonal(N, M);

        StringBuilder sb = new StringBuilder();
        for (int[] row : answer) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append(System.lineSeparator());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int[][] fillDiagonal(int N, int M) {
        int[][] arr = new int[N][M];
        int num = 1;

        for (int sum = 0; sum < N + M - 1; sum++) {
            for (int row = 0; row < N; row++) {
                int col = sum - row;
                if (col >= 0 && col < M) {
                    arr[row][col] = num++;
                }
            }
        }

        return arr;
    }
}
