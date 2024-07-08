import java.util.*;

public class Problem1850D {
    private static void solve(Scanner sc) {
        int n = sc.nextInt(); // problems to be set
        int k = sc.nextInt();
        int[] a = new int[n]; // ith problem has ai difficuly
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int maxlen = 0;
        int len = 1;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i + 1] - a[i]) <= k) {
                len++;
            } else {
                len = 1;
            }
            maxlen = Math.max(maxlen, len);
        }
        System.out.println(n - maxlen);
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
