import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

//        st = new StringTokenizer(br.readLine());
//        int A = Integer.parseInt(st.nextToken());
//        int N = Integer.parseInt(st.nextToken());

        for (int i = 5; i < 18; i++) {
            System.out.print(i + " ");
        }

//        bw.write(String.valueOf(A));
        bw.flush();
        bw.close();
        br.close();
    }
}
