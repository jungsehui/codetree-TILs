import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] s = line.split(" ");
        StringBuilder text = new StringBuilder(s[0]);
        int q = Integer.parseInt(s[1]);
        
        for (int i = 0; i < q; i++) {
            int req = Integer.parseInt(br.readLine());

            if (req == 1) {
                char first = text.charAt(0);
                String newText = text.substring(1);
                String res = newText + first;
                text = new StringBuilder(res);
            }

            if (req == 2) {
                char last = text.charAt(text.length() - 1);
                StringBuilder newText = new StringBuilder();
                newText.append(last);

                for (int j = 0; j < text.length() - 1; j++) {
                    newText.append(text.charAt(j));
                }
                text = newText;
            }

            if (req == 3) {
                StringBuilder reversed = new StringBuilder();
                for (int j = text.length() - 1; j >= 0; j--) {
                    reversed.append(text.charAt(j));
                }
                text = reversed;

                // int left = 0;
                // int right = text.length() - 1;

                // while (left < right) {
                //     char temp = text.charAt(left);
                //     text.setCharAt(left, text.charAt(right));
                //     text.setCharAt(right, temp);

                //     left++;
                //     right--;
                // }
            }

            bw.write(text.toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
