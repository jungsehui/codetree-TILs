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

        for (int i = 0; i < N + M - 1; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (i == j + k) {
                        arr[j][k] = num;
                        num++;
                    }
                }
            }
        }

        return arr;
    }
}
