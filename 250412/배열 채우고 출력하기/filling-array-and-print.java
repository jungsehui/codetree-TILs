import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

//        st = new StringTokenizer(br.readLine());
//        int AM = Integer.parseInt(st.nextToken());
        List<String> l = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            l.add(st.nextToken());
        }
        Collections.reverse(l);
        for (String s : l) {
            System.out.print(s);
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
