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
        st = new StringTokenizer(br.readLine());
        int BM = Integer.parseInt(st.nextToken());
//        int BE = Integer.parseInt(st.nextToken());

        if (AM == 0) {
            if (BM >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if (AM == 1) {
            if (BM >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
