import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        int top = 0;
        int bottom = N - 1;
        int left = 0;
        
        while (left < N) {
            if (left < N) {
                for (int i = top; i <= bottom; i++) {
                    arr[i][left] = i + 1;
                }
                left++;
            }

            if (left < N) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = N - i;
                }
                left++;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
