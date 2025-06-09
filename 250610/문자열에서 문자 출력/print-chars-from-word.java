import java.io.*;
import java.util.*;

public class Main {

    private static final int INF = 123456789;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }

        br.close();
    }
}
