import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int[][] numbers = new int[2][4];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        float rowAverage = 0.0f;
        float colAverage = 0.0f;
        float entAverage = 0.0f;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                rowAverage += numbers[i][j];
                entAverage += numbers[i][j];
            }

            rowAverage /= 4;
            sb.append(rowAverage).append(" ");
            rowAverage = 0.0f;
        }

        sb.append(System.lineSeparator());

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                colAverage += numbers[j][i];
            }

            colAverage /= 2;
            sb.append(colAverage).append(" ");
            colAverage = 0.0f;
        }

        sb.append(System.lineSeparator());

        entAverage /= 8;
        sb.append(entAverage).append(" ");

        System.out.println(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}