import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s = br.readLine();

        bw.write(s.substring(2, 10));
        bw.flush();
        bw.close();
        br.close();
    }
}
