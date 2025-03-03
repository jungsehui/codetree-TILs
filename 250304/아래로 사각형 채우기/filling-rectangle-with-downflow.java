import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int[][] numbers = new int[N][N];
        int start = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                start++;
                numbers[j][i] = start;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
