import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = br.readLine();

        char[] chars = line.toCharArray();
        chars[1] = 'a';
        chars[chars.length - 2] = 'a';

        String value = String.valueOf(chars);
        System.out.println(value);

        bw.flush();
        bw.close();
        br.close();
    }
}
