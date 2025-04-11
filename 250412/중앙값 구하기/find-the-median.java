import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
//        int AM = Integer.parseInt(st.nextToken());
//        int BM = Integer.parseInt(st.nextToken());
//        int CM = Integer.parseInt(st.nextToken());
//        int AE = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int BM = Integer.parseInt(st.nextToken());
//        int BE = Integer.parseInt(st.nextToken());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);

        System.out.println(arr[1]);

        bw.flush();
        bw.close();
        br.close();
    }
}
