import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 문자열 A와 문자열 B가 주어지면 문자열 A의 부분문자열 중
        // 가장 앞에 등장하는 B와 같은 문자열을 찾아 지우려고 합니다.
        // 지우고 난 후 떨어져 있는 A의 문자열들을 다시 붙여 만들어진 새로운 문자열에서
        // 부분 문자열 B가 없을 때까지 지우는 것을 반복합니다.

        String A = br.readLine();
        String B = br.readLine();

        String currA = A;

        while (true) {
            boolean found = false;
            int foundIndex = -1;

            for (int i = 0; i <= currA.length() - B.length(); i++) {
                String sub = currA.substring(i, i + B.length());

                if (sub.equals(B)) {
                    found = true;
                    foundIndex = i;
                    break;
                }
            }

            if (found) {
                currA = currA.substring(0, foundIndex) +
                        currA.substring(foundIndex + B.length());
            } else {
                break;
            }
        }

        System.out.println(currA);
        bw.flush();
        bw.close();
        br.close();
    }
}
