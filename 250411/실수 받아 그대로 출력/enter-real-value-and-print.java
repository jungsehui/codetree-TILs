import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double a = Double.parseDouble(br.readLine());
        System.out.printf("%.2f", a);

        bw.flush();
        bw.close();
        br.close();
    }
}
