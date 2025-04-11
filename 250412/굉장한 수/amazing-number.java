import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int AM = Integer.parseInt(st.nextToken());
//        int AE = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int BM = Integer.parseInt(st.nextToken());
//        int BE = Integer.parseInt(st.nextToken());

        if (AM % 2 != 0 && AM % 3 == 0) {
            System.out.println("true");
        } else if (AM % 2 == 0 && AM % 5 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
