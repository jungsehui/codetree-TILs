import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int min = numbers[1] - numbers[0];

        for (int i = 2; i < N; i++) {
            int next = numbers[i];
            int now = numbers[i - 1];
            if (next - now < min) {
                min = next - now;
            }
        }

        System.out.println(min);

        bw.flush();
        bw.close();
        bw.close();
    }
}