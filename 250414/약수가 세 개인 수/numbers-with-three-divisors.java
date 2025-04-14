import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = N; i <= M; i++){
            int sqrt = (int)Math.sqrt(i);
            if (sqrt * sqrt == i && isPrime(sqrt)) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
