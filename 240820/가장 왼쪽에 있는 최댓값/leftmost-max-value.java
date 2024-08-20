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

        while (arr.length >= 1) {
            int maxVal = -1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= maxVal) {
                    maxVal = arr[j];
                }
            }

            int index = 0;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == maxVal) {
                    index = k;
                    break;
                }
            }

            System.out.print(index + 1 + " ");

            arr = Arrays.copyOfRange(arr, 0, index);
        }
    }
}