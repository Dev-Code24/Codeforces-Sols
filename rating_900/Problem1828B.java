import java.util.*;

public class Problem1828B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        
        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sol = -1;

        for (int i = 0; i < n; i++) {
            int dif = Math.abs(a[i] - (i + 1));
            if (dif == 0) continue;
            if (sol == -1) {
                sol = dif;
                continue;
            }
            sol = gcd(Math.min(sol, dif), Math.max(sol, dif));
        }

        System.out.println(sol);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
