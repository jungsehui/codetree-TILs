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

        String A = br.readLine();
        String B = br.readLine();

        String target1 = A + B;
        String target2 = B + A;
        if (target1.equals(target2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
