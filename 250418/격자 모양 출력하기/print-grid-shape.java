import java.io.*;
import java.util.*;

public class Main {

    private static final int INF = Integer.MAX_VALUE >> 2;
    private static final int[] dp = new int[1111111];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //2 3
        //1 1
        //1 2
        //2 2
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int num = 1;
        int[][] arr = new int[N][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[r - 1][c - 1] = r * c;
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                bw.write(anInt + " ");
            }
            bw.write(System.lineSeparator());
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int solveUsingBruteforce(int X) {
        // Base Condition
        if (X == 1) {
            return 0;
        }

        int ret = INF;

        // 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
        if (X % 3 == 0) {
            ret = Math.min(ret, 1 + solveUsingBruteforce(X / 3));
        }

        // 2. X가 2로 나누어 떨어지면, 2로 나눈다.
        if (X % 2 == 0) {
            ret = Math.min(ret, 1 + solveUsingBruteforce(X / 2));
        }

        // 3. 1을 뺀다.
        ret = Math.min(ret, 1 + solveUsingBruteforce(X - 1));

        return ret;
    }

    private static int solveUsingTopDown(int X) {
        // Base Condition
        if (X == 1) {
            return 0;
        }
        if (dp[X] != 0) {
            return dp[X];
        }

        int ret = INF;

        // 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
        if (X % 3 == 0) {
            ret = Math.min(ret, 1 + solveUsingTopDown(X / 3));
        }

        // 2. X가 2로 나누어 떨어지면, 2로 나눈다.
        if (X % 2 == 0) {
            ret = Math.min(ret, 1 + solveUsingTopDown(X / 2));
        }

        // 3. 1을 뺀다.
        ret = Math.min(ret, 1 + solveUsingTopDown(X - 1));

        dp[X] = ret;

        return ret;
    }

    private static int solveUsingBottomUp(int N) {
        // dp[i] => i라는 숫자가 1이 되기 위해 필요한 연산의 수
        // answer : dp[N]
        Arrays.fill(dp, INF);

        // Base Condition
        dp[1] = 0;

        for (int i = 1; i <= N; ++i) {
            if (i * 3 <= N)
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);

            if (i * 2 <= N)
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);

            if (i + 1 <= N)
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
        }

        return dp[N];
    }
}
