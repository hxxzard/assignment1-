import java.util.Scanner;

public class task4d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(K % N);
    }
}