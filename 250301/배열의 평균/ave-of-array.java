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

        float rowSum;
        float colSum;
        float entSum = 0.0f;


        for (int i = 0; i < 2; i++) {
            rowSum = 0.0f;

            for (int j = 0; j < 4; j++) {
                rowSum += numbers[i][j];
                entSum += numbers[i][j];
            }

            sb.append(String.format("%.1f", rowSum / 4)).append(" ");
        }

        sb.append(System.lineSeparator());

        for (int i = 0; i < 4; i++) {
            colSum = 0.0f;

            for (int j = 0; j < 2; j++) {
                colSum += numbers[j][i];
            }

            sb.append(String.format("%.1f", colSum / 2)).append(" ");
        }

        sb.append(System.lineSeparator());

        sb.append(String.format("%.1f", entSum / 8));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}