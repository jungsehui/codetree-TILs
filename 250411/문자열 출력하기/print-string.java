import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String s = "LeebrosCode";

        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeated.append(s);
        }

        bw.write(repeated.toString());
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
