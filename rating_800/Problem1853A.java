import java.util.*;

public class Problem1853A {
    private static void solve(Scanner sc) {
        // Scanning part done
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean sorted = true;
        int diff = (int) 1e9;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i > 0) {
                diff = Math.min(diff, a[i] - a[i - 1]);
                if (a[i - 1] > a[i])
                    sorted = false;
            }
        }
        if (!sorted) {
            System.out.println(0);
            return;
        }
        System.out.println((diff / 2) + 1);
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
