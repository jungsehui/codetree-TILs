import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<String> strings = new ArrayDeque<>();
        for (int i = 0; i < 4; i++) {
            strings.add(br.readLine());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(strings.pop());
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
