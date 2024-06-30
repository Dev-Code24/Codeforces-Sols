import java.util.Scanner;

public class Problem1829B {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int len = 0, maxlen = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 0) {
                len++;
                maxlen = Math.max(maxlen, len);
            } else {
                len = 0;
            }
        }
        System.out.println(maxlen);
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
