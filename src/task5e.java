import java.util.Scanner;

public class task5e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int position = (v * t) % 109;

        if (position < 0) {
            position += 109;
        }

        System.out.println(position);
    }
}