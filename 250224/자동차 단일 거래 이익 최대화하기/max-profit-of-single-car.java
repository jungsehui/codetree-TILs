import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] prices = new int[N];
        List<Integer> benefits = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int standard = prices[i];

            for (int j = i + 1; j < N; j++) {
                int target = prices[j];

                if (target > standard) {
                    benefits.add(target - standard);
                }
            }
        }

        if (benefits.isEmpty()) {
            System.out.println(0);
            return;
        }

        int max = 0;

        for (int elem : benefits) {
            if (elem > max) {
                max = elem;
            }
        }

        System.out.println(max);
        
        bw.flush();
        bw.close();
        bw.close();
    }
}