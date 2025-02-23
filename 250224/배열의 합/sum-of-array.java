import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] numbers = new int[4][4];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
                sum += numbers[i][j];
            }
            
            sb.append(sum).append(System.lineSeparator());
        }

        System.out.println(sb);

        bw.flush();
        bw.close();
        bw.close();
    }
}