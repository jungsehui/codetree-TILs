import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            repeated.append(s);
        }

        bw.write(repeated.toString());
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
