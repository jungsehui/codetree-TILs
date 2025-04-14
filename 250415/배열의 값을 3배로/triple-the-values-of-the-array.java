import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                bw.write((anInt * 3) + " ");
            }
            bw.write(System.lineSeparator());
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
