import java.io.*;
import java.util.*;

public class Main {

    private static final int INF = 123456789;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] lines = new String[10];
        for (int i = 0; i < 10; i++) {
            lines[i] = br.readLine();
        }
        String word = br.readLine();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            int length = lines[i].length();
            if (lines[i].charAt(length - 1) == word.charAt(0)) {
                count++;
                System.out.println(lines[i]);
            }
        }

        if (count == 0) {
            System.out.println("None");
        }
        br.close();
    }
}
