import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a >= b ? 1 : 0);
        System.out.println(a > b ? 1 : 0);
        System.out.println(b >= a ? 1 : 0);
        System.out.println(b > a ? 1 : 0);
        System.out.println(a == b ? 1 : 0);
        System.out.println(a != b ? 1 : 0);
        bw.flush();
        bw.close();
        br.close();
    }
}
