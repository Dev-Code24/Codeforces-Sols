import java.util.*;

public class Problem1992A {
    private static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxprod = helper(a, b, c, 5);
        System.out.println(maxprod);
    }

    private static int helper(int a, int b, int c, int counter) {
        if (counter == 0) {
            return a * b * c;
        }
        int case1 = helper(a + 1, b, c, counter - 1);
        int case2 = helper(a, b + 1, c, counter - 1);
        int case3 = helper(a, b, c + 1, counter - 1);

        return Math.max(case1, Math.max(case2, case3));
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

