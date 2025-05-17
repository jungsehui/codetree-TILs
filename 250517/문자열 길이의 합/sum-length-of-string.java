import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String token = st.nextToken();
            if (token.charAt(0) == 'a') {
                count++;
            }
            sb.append(token);
        }

        System.out.println(sb.toString().length() + " " + count);
        bw.flush();
        bw.close();
        br.close();
    }
}
