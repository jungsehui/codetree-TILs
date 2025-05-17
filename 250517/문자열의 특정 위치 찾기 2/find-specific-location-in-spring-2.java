import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[] strings = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

        st = new StringTokenizer(br.readLine());
        char c = st.nextToken().charAt(0);

        int count = 0;
        for (String string : strings) {
            if (c == string.charAt(2) || c == string.charAt(3)) {
                System.out.println(string);
                count++;
            }
        }

        System.out.println(count);
        bw.flush();
        bw.close();
        br.close();
    }
}
