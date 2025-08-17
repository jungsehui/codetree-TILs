import java.io.*;
import java.util.*;

public class Main {

    private static String EE = "ee";
    private static String AB = "ab";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String text = br.readLine();

        StringBuilder sb = new StringBuilder();

        boolean eFlag = false;
        boolean aFlag = false;
        // LeeBrosCode
        for (int i = 0; i < text.length() - 2; i++) {
            if (text.substring(i, i + 2).equals(EE)) {
                eFlag = true;
            }

            if (text.substring(i, i + 2).equals(AB)) {
                aFlag = true;
            }
        }

        if (eFlag) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (aFlag) {
            System.out.print("Yes");
        } else {
            System.out.print("No ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
