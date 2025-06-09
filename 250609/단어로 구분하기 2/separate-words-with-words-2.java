import java.io.*;
import java.util.*;

public class Main {

    private static final int INF = 123456789;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] words = br.readLine().split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                System.out.println(words[i]);
            }
        }

        br.close();
    }
}
