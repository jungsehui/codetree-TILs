import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = N; i < 101; i++) {
            String s = check(i);
            sb.append(s).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static String check(int score) {
        String ret = "F";
        if (score >= 90) {
            ret = "A";
        } else if (score >= 80) {
            ret = "B";
        } else if (score >= 70) {
            ret = "C";
        } else if (score >= 60) {
            ret = "D";
        } else {
            return "F";
        }
        return ret;
    }
}
