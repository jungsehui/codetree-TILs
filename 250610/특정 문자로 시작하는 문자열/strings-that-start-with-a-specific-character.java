import java.io.*;
import java.util.*;

public class Main {

    private static final int INF = 123456789;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        String[] lines = new String[N];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = br.readLine();
        }
        String word = br.readLine();

        int count = 0;
        double d = 0.0;

        for (int i = 0; i < N; i++) {
            if (lines[i].charAt(0) == word.charAt(0)) {
                count++;
                d += lines[i].length();
            }
        }

        System.out.println(count);
        System.out.printf("%.2f", (d / N));
        br.close();
    }
}
