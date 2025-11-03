import java.io.*;
import java.util.*;

public class Main {

    private static long N;
    private static int M;
    private static int[] playTimes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = br.readLine();
        char firstChar = line.charAt(0);
        char secondChar = line.charAt(1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == firstChar) {
                sb.append(secondChar);
            } else if (c == secondChar) {
                sb.append(firstChar);
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
