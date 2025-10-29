import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String input = br.readLine();
        String target = br.readLine();

        int count = 0;

        for (int i = 0; i <= input.length() - target.length(); i++) {
            if (input.startsWith(target, i)) {
                count++;
            }
        }

        System.out.println(count);

        bw.flush();
        bw.close();
        br.close();
    }
}
