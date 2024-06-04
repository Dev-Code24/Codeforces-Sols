package rating_800;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution
 */
public class Problem1903A {

    public static boolean solve(int[] a, int k) {
        int n = a.length;
        if (k == 1) {
            int[] copy = a.clone();
            Arrays.sort(copy);
            for (int i = 0; i < n; i++) {
                if (copy[i] != a[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int zz = 0; zz < t; zz++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            if (solve(a, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
