import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        String s = switch (a) {
            case 90 -> "A";
            case 80 -> "B";
            case 70 -> "C";
            case 60 -> "D";
            default -> "F";
        };
        
        bw.write(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
