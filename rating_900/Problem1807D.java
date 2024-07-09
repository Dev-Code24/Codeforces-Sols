import java.util.*;

public class Problem1807D {
    private static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    private static int rangeSum(int l, int r, int[] prefix) {
        if (l == 0)
            return prefix[r];
        else
            return prefix[r] - prefix[l - 1];
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt(); // arr length
        int q = sc.nextInt(); // query length
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int[] prefix = prefixSum(a);

        for (int i = 0; i < q; i++) {
            long temp = sum;
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int val = sc.nextInt();
            temp = temp - rangeSum(l, r, prefix) + (val * (r - l + 1));

            if (temp % 2 == 0)
                System.out.println("NO");
            else {
                System.out.println("YES");
            }
        }

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
