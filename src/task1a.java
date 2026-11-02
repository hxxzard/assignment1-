import java.util.Scanner;

public class task1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);

        System.out.println(c);
    }
}