import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (
                    i == 1 ||
                    i == line.length() - 2
            ) {
                continue;
            }
            sb.append(line.charAt(i));
        }

        System.out.println(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
