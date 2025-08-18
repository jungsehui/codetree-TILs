import java.io.*;
import java.util.*;

public class Main {

    private static String EE = "ee";
    private static String AB = "ab";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String text = st.nextToken();
        String target = st.nextToken();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("No");

        bw.flush();
        bw.close();
        br.close();
    }
}
