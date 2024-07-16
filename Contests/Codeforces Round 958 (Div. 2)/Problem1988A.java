import java.util.*;

public class Problem1988A {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(Math.ceilDiv((n - 1), (k - 1)));
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