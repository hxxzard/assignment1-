import java.util.Scanner;

public class task14n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int totalMinutes = 9 * 60 + (n - 1) * 45 + (n - 1) / 2 * 5 + n / 2 * 15;

        System.out.println(totalMinutes / 60 + " " + totalMinutes % 60);
    }
}