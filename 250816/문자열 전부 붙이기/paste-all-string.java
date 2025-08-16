import java.io.*;
import java.util.*;

public class Main {

    // 8방향을 효율적으로 탐색하기 위한 배열 (상, 하, 좌, 우, 대각선)
    private static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken());
        }

        System.out.println(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
