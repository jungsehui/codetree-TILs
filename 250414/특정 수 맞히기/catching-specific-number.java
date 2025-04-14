import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int answer = 25;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num > answer) {
                sb.append("Lower").append(System.lineSeparator());
            } else if (num < answer) {
                sb.append("Higher").append(System.lineSeparator());
            } else {
                sb.append("Good").append(System.lineSeparator());
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static String check(int score) {
        String ret = "F";
        if (score >= 90) {
            ret = "A";
        } else if (score >= 80) {
            ret = "B";
        } else if (score >= 70) {
            ret = "C";
        } else if (score >= 60) {
            ret = "D";
        } else {
            return "F";
        }
        return ret;
    }

    private static void temp() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());

        String[] strings = {"apple", "banana", "grape", "blueberry", "orange"};

        int count = 0;
        char c = st.nextToken().charAt(0);
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            if (string.charAt(2) == c || string.charAt(3) == c) {
                sb.append(string).append(System.lineSeparator());
                count++;
            }
        }

        br.close();
    }
}
