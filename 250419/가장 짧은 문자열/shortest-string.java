import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = br.readLine();
        }
        Arrays.sort(s, Comparator.comparing(String::length));

        System.out.println(s[2].length() - s[0].length());
        bw.flush();
        bw.close();
        br.close();
    }
}
