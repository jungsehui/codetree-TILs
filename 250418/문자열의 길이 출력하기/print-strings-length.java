import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX = 30;
    private static int[][] pascal;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s1 = br.readLine();
        String s2 = br.readLine();

        System.out.println(s1.length() + s2.length());

        bw.flush();
        bw.close();
        br.close();
    }
}
