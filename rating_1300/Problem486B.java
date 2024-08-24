import java.util.*;

public class Problem486B {
    static int m, n;
    static int B[][], A[][];

    public static void solve(Scanner sc) {
        m = sc.nextInt();
        n = sc.nextInt();
        B = new int[m][n];
        A = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < m; i++) {
            Arrays.fill(A[i], 1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (B[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        A[k][j] = 0; 
                    }
                    for (int k = 0; k < n; k++) {
                        A[i][k] = 0; 
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = 0;
                for (int k = 0; k < n; k++) {
                    val |= A[i][k];
                }
                for (int k = 0; k < m; k++) {
                    val |= A[k][j];
                }
                if (B[i][j] != val) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    // private static long gcd(long a, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static long lcm(long a, long b) {
    // return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    // long first;
    // long second;
    //
    // Pair(long _first, long _second) {
    // this.first = _first;
    // this.second = _second;
    // }
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // @Override
    // public String toString() {
    // return "(" + first + ',' + second + ")";
    // }
    // }
}