import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //4 4
        //1 4 5 2
        //3 3 5 2
        //3 6 2 1
        //6 2 5 4
        //3 4 5 2
        //3 3 2 2
        //3 6 2 1
        //6 3 5 4
        int[][] num1 = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                num1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] num2 = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                num2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (num1[i][j] != num2[i][j]) {
                    arr[i][j] = 1;
                }
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
