public class Main {
    public static void main(String[] args) {
        int weight = 13;
        double gravity = 0.165;
        double ratio = weight * gravity;

        System.out.printf("%d * %.6f = %.6f%n", weight, gravity, ratio);
    }
}
