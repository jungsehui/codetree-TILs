import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            sb.append(s);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
