import java.util.*;

public class Problem1992C {
    private static void solve(Scanner sc) {
        int n = sc.nextInt(); // length of the permutation
        int m = sc.nextInt(); // el not greater than m gi
        int k = sc.nextInt(); // el not smaller than k fi
        int[] a = new int[n];
        int i = 0;
        while ((n - i) > m) {
            a[i] = (n - i);
            System.out.print(a[i] + " ");
            i++;
        }
        while (i < n) {
            a[i] = (i + m - n + 1);
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.println();

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
