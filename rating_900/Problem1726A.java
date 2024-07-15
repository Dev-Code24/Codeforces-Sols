import java.util.*;

public class Problem1726A {
    private static void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] A = new int[N];
        int ans = -1000000007;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, A[(i - 1 + N) % N] - A[i]); // diff between alternate els
        }

        for (int i = 1; i < N; i++) {
            ans = Math.max(ans, A[i] - A[0]);
        }

        for (int i = 0; i < N - 1; i++) {
            ans = Math.max(ans, A[N - 1] - A[i]);
        }

        System.out.println(ans);
        // maximise a[n-1]-a[0];
        // somehow want maxi - mini == (n - 1) by rotating

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
