package rating_800;
import java.util.Scanner;

public class Problem1900A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int result = processTestCase(n, s);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int processTestCase(int n, String s) {
        int cnt = 0;
        for (int i = 0; i < n - 2; ++i) {
            if (s.substring(i, i + 3).equals("...")) {
                return 2;
            }
        }
        for (char i : s.toCharArray()) {
            if (i == '.') {
                ++cnt;
            }
        }
        return cnt;
    }
}
