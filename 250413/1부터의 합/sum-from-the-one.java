import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= N) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static String check(int score) {
        String ret = "F";
        if (score >= 90) {
            ret = "A";
        } else if (score >= 80) {
            ret = "B";
        } else if (score >= 70) {
            ret = "C";
        } else if (score >= 60) {
            ret = "D";
        } else {
            return "F";
        }
        return ret;
    }
}
