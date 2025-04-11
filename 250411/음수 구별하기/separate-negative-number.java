import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        if (!(a < 0)) {
            System.out.println(a);
            return;
        }

        System.out.println(a);
        System.out.println("minus");
        bw.flush();
        bw.close();
        br.close();
    }
}
