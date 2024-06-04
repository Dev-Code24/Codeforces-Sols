package rating_800;
import java.util.Scanner;

public class Problem1899A {
    // can either add 1 or subtract 1
    private static String solution(int n) {
        if (n % 3 != 0)
            return "First";
        else
            return "Second";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int n = scanner.nextInt();
            System.out.println(solution(n));
        }

        scanner.close();
    }
}
