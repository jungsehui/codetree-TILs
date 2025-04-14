import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int num = 0;
        for(int i = 0; i < N; i++){
            for (int j = 0; j <= i; j++) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
