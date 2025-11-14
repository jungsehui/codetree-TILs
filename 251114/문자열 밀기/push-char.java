import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        s = s.substring(1) + s.substring(0, 1);

        System.out.println(s);
    }
}
