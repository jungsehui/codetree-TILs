import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX = 30;
    private static int[][] pascal;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        System.out.println(s);
        System.out.println(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
