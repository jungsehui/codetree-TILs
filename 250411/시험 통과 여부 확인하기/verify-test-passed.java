import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        if (!(N >= 80)) {
            System.out.println((80 - N) + " more score");
        } else {
            System.out.println("pass");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
