import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 10; i++) {
            System.out.print((f % 10) + " ");
            int next = (f + s) % 10;
            f = s;
            s = next;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
