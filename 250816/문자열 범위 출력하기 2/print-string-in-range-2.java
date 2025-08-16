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

        String text = br.readLine();
        int N = Integer.parseInt(br.readLine());

        int len = text.length() - 1;
        while (N-- > 0) {
            System.out.print(text.charAt(len));
            len--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
