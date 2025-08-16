import java.io.*;
import java.util.*;

public class Main {

    // 8방향을 효율적으로 탐색하기 위한 배열 (상, 하, 좌, 우, 대각선)
    private static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static int INF = Integer.MAX_VALUE >> 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(st.nextToken());
        }

        String line = sb.toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (i > 0 && i % 5 == 0) {
                result.append("\n");
            }
            result.append(line.charAt(i));
        }

        bw.write(result.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
