import java.util.*;

public class Problem1679A {
    private static void solve(Scanner sc) {
        long n = sc.nextLong(); // either divisible by 4 or 6

        if (n < 4 || n % 2 != 0) {
            System.out.println(-1);
            return;
        }
        long minMoves = (n % 6 == 0) ? n / 6 : n / 6 + 1;
        long maxMoves = n / 4;

        System.out.println(minMoves + " " + maxMoves);

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
