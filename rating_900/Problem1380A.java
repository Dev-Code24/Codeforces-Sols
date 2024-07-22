import java.util.*;

public class Problem1380A {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = j + 1;
                if (a[i] < a[j] && a[j] > a[k]) {
                    System.out.println("YES");
                    System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
                    return;
                }
            }
        }
        System.out.println("NO");
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
    /*
     * private static long gcd(long a, long b) {
     * while (b != 0) {
     * long temp = b;
     * b = a % b;
     * a = temp;
     * }
     * return a;
     * }
     * private static long lcm(long a, long b) {
     * return a * b / gcd(a, b);
     * }
     */
}