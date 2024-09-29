import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] a = new long[n + 2][m + 2];

            for (int i = 1; i <= m + 1; i++) {
                a[0][i] = 0;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = sc.nextLong();
                }
            }

            solve(a, n, m);
        }
        sc.close();
    }

    // So instead of processing the aij = aij - 1 again and again
    // what is done in the code is that the minValue is made from Min of 
    // the max value among the neighbors of the current cells value, and the current cell's value
    public static void solve(long[][] a, int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                long minValue = Math
                        .min(Math.max(Math.max(a[i][j - 1], a[i - 1][j]), Math.max(a[i + 1][j], a[i][j + 1])), a[i][j]);
                System.out.print(minValue + " ");
            }
            System.out.println();
        }
    }

}
