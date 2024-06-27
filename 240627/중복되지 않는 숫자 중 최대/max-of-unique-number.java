import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = -1;
        int count = 0;

        // 1 2 1 2
        for (int j = 0; j < N; j++) {
            if (arr[j] > maxVal) {
                maxVal = arr[j];
            }
        }

        for (int k = 0; k < N; k++) {
            if (maxVal == arr[k]) {
                count++;
            }
        }

        if (count == 2) {
            System.out.print(-1);
        } else {
            System.out.print(maxVal);
        }

    }
}