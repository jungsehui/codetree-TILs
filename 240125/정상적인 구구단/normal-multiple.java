import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                if (j != n) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}