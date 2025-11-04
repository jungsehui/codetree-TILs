import java.io.*;
import java.util.*;

public class Main {

    /*
        aba 2
        1 1 2
        2 a c
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        int Q = Integer.parseInt(st.nextToken());

        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine());

            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                // a번째 문자와 b번째 문자를 서로 바꾸기
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                int aIdx = a - 1;
                int bIdx = b - 1;

                char[] sChars = S.toCharArray();

                char temp = sChars[aIdx];
                sChars[aIdx] = sChars[bIdx];
                sChars[bIdx] = temp;

                S = String.valueOf(sChars);
                System.out.println(S);
            } else if (type == 2) {
                String x = st.nextToken();
                String y = st.nextToken();
                S = S.replace(x, y);
                System.out.println(S);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
