import java.util.*;

/*
 * This question is pure Math according to me no logic or DSA required
 */
public class Problem1883C {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        if (k == 4) {
            int even = 0;
            boolean hasMultiple = false;
            for (int i : arr) {
                if (i % 2 == 0)
                    even++;
                if (i % 4 == 0)
                    hasMultiple = true;
            }
            if (even == 0) {
                min = 2;
            }
            if (even == 1) {
                min = 1;
            }
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] + 1) % 4 == 0) {
                    min = 1;
                    break;
                }
            }
            if (hasMultiple) {
                min = 0;
            }
            if (even >= 2) {
                min = 0;
            }

        } else {
            for (int i = 0; i < n; i++) {
                int div = arr[i] / k;
                if (div * k == arr[i]) {
                    min = 0;
                    break;
                } else {
                    div++;
                    min = Math.min(min, (div * k) - arr[i]);
                }
            }
        }

        System.out.println(min);

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