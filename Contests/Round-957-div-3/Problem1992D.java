import java.util.*;

// submit this final code
public class Problem1992D {
    private static final int INF = 1_000_000_007;

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = "L" + s + "L";
        n += 2;

        int[] dp = new int[n];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        m++;

        for (int i = 0; i < n; ++i) {
            if (dp[i] == INF)
                continue;
            if (s.charAt(i) == 'L') {
                for (int j = i; j < Math.min(n, i + m); ++j) {
                    if (s.charAt(j) != 'C') {
                        dp[j] = Math.min(dp[j], dp[i]);
                    }
                }
            }
            if (i + 1 < n && s.charAt(i + 1) != 'C') {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
        }

        System.out.println(dp[n - 1] <= k ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
