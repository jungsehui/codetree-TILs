import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = br.readLine();
        while (line.length() > 1) {
            int index = Integer.parseInt(br.readLine());

            if (index > line.length() - 1) {
                line = line.substring(0, line.length() - 1);
            } else {
                line = line.substring(0, index) + line.substring(index + 1);
            }
            System.out.println(line);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
