import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX = 31;
    private static final int[][] dp = new int[MAX][MAX];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 == l2) {
            bw.write("same");
        } else if (l1 > l2) {
            bw.write(s1 + " " + l1);
        } else {
            bw.write(s2 + " " + l2);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
