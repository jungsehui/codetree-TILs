import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 1 2 3
        //4 5 6
        //7 8 9
        //
        //2 3 4
        //5 6 7
        //8 9 10
        int[][] num1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                num1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.readLine();

        int[][] num2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                num2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bw.write((num1[i][j] * num2[i][j]) + " ");
            }
            bw.write(System.lineSeparator());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
