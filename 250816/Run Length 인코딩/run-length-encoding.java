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

        StringBuilder sb = new StringBuilder();

        char curr = text.charAt(0);
        int count = 1;
        for (int i = 1; i < text.length(); i++) {
            // 만약 다음 뽑은 글자가 전 글자랑 같다면 count++ 하고 sb에 추가하고 등등
            if (text.charAt(i) == curr) {
                count++;
            } else {
                sb.append(curr);
                sb.append(count);

                curr = text.charAt(i);
                count = 1;
            }
        }

        sb.append(curr);
        sb.append(count);

        System.out.println(sb.length());
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
