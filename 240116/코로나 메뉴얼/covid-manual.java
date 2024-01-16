import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int countA = 0;

        for (int i = 0; i < 3; i++) {
            char symptom = scanner.next().charAt(0);
            double temperature = scanner.nextDouble();

            if (symptom == 'Y' && temperature >= 37.0) {
                countA++;
            }
        }

        if (countA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}