import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();

        StringBuilder sb = new StringBuilder(a);
        if (sb.length() > 1) {
            sb.setCharAt(1, 'a');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
