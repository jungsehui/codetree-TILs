import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char[] tokens = br.readLine().toCharArray();

            for (int j = 0; j < tokens.length; j++) {
                if (tokens[j] == ' ') {
                    continue;
                }
                char c = (char) (tokens[j] - 32);
                sb.append(c).append(" ");
            }

            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}