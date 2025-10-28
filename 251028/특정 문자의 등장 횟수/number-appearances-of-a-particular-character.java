import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int eeCount = 0;
        int ebCount = 0;

        for (int i = 0; i < line.length() - 1; i++) {
            String sub = line.substring(i, i + 2);

            if (sub.equals("ee")) {
                eeCount++;
            } else if (sub.equals("eb")) {
                ebCount++;
            }
        }

        System.out.println(eeCount + " " + ebCount);

        br.close();
    }
}