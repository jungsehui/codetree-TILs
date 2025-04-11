import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        if (a >= 3000) {
            System.out.println("book");
        } else if (a >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
