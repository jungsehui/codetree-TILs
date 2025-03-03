import java.io.*;
import java.util.*;

/*
3 3 54 5
2 6 7 81
3 31 2 1
95 5 7 1
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
        bw.flush();
        bw.close();
        br.close();
    }
}