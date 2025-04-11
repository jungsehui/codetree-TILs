import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());
        System.out.printf("%.3f\n", a);
        System.out.printf("%.3f\n", b);
        System.out.printf("%.3f\n", c);

        bw.flush();
        bw.close();
        br.close();
    }
}
