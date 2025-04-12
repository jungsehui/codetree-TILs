import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        StringBuilder a = new StringBuilder(st.nextToken());
//        String b = st.nextToken();
//        int f = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print((f % 10) + " ");
//            int next = (f + s) % 10;
//            f = s;
//            s = next;
//        }
//        leebroscode

        a.setCharAt(1, 'a');
        a.setCharAt(a.length() - 1, 'a');

        bw.write(a.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
