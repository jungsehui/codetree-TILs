import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;
        for(int i = N; i <= M; i++){
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 3) {
                result++;
            }
        }

        System.out.println(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
