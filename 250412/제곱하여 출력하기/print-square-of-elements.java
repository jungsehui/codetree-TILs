import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> l = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            l.add(Integer.parseInt(st.nextToken()));
        }
        for (int elem : l) {
            System.out.print((elem * elem) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
