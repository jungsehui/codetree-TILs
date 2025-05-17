import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (st.hasMoreTokens()) {
                sb.append(st.nextToken()).append(System.lineSeparator());
            } else {
                break;
            }
        }

        System.out.println(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
