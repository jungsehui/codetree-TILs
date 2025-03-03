import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        for (int j = 0; j < 3; j++) {
            st = new StringTokenizer(br.readLine());

            for (int k = 0; k < 3; k++) {
                a[j][k] = Integer.parseInt(st.nextToken());
            }
        }
        String line = br.readLine();
        for (int j = 0; j < 3; j++) {
            st = new StringTokenizer(br.readLine());

            for (int k = 0; k < 3; k++) {
                b[j][k] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(a[i][j] * b[i][j]).append(" ");
            }
            sb.append(System.lineSeparator());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
