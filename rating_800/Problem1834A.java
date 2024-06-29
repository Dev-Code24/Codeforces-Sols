import java.util.Scanner;

public class Problem1834A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            product *= a;
        }
        while (sum < 0 || product != 1) {
            sum += 2;
            product *= -1;
            c++;
        }
        System.out.println(c);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
