import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < (i * 2) - 1; j++){
                System.out.print("*");
            }
//            for(int j = 0; j < 5-i; j++){
//                System.out.print(" ");
//            }
            System.out.println();
        }

//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                sb.append("*").append(" ");
//            }
//            sb.append(System.lineSeparator());
//        }
//
//        bw.write(sb.toString());
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
