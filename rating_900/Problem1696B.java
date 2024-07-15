import java.util.*;

public class Problem1696B {
    // To find the minimum number of times NIT snaps his finger
    // everytime w = mex(S) , w has to be 0;
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0, r = 0;
        int count = 0;

        while (r < n) {
            while (r < n && a[r] == 0) {
                r++;
            }
            if (r < n) {
                count++;
            }
            while (r < n && a[r] != 0) {
                r++;
            }
            l = r;
        }

        System.out.println(Math.min(count, 2));
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
