import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int lower = Integer.MIN_VALUE;
        int upper = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (target < 500) {
                if (target > lower) {
                    lower = target;
                }
            } else if (target > 500) {
                if (target < upper) {
                    upper = target;
                }
            }
        }

        System.out.print(lower + " " + upper);

        bw.flush();
        bw.close();
        br.close();
    }
}