import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s = br.readLine();
        char c = br.readLine().charAt(0);

        int count = 0;
        for (char c1 : s.toCharArray()) {
            if (c == c1) {
                count++;
            }
        }
        
        bw.write(count + " ");
        bw.flush();
        bw.close();
        br.close();
    }
}
