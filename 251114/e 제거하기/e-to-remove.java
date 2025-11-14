import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'e') {
                line = line.substring(0, i) + line.substring(i + 1);
                break;
            }
        }

        System.out.println(line);
        bw.flush();
        bw.close();
        br.close();
    }
}
