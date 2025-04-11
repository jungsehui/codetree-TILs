import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 더 작으면 1, 아니면 0
        // 같으면 1, 아니면 0
        if (a < b) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (a == b) {
            System.out.print(1 + " ");
        } else {
            System.out.println(0 + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
