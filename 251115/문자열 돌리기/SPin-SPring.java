import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = br.readLine();
        System.out.println(line);

        for (int i = 0; i < line.length(); i++) {
            String first = line.substring(1);
            String second = line.substring(0, 1);

            line = first + second;
            System.out.println(line);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
