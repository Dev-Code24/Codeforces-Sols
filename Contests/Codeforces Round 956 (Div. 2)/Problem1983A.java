import java.util.*;

public class Problem1983A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " ");
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