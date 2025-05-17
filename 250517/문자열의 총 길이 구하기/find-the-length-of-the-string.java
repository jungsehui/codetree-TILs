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
        for (int i = 0; i < 10; i++) {
            sb.append(st.nextToken());
        }

        System.out.println(sb.toString().length());
        bw.flush();
        bw.close();
        br.close();
    }
}
