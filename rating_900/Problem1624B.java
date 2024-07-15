import java.util.*;

public class Problem1624B {
    public static void solve(Scanner sc) {
        int a = sc.nextInt(); // a
        int b = sc.nextInt(); // a + d
        int c = sc.nextInt(); // a + 2.d
        int new_a = b - (c - b);
        if (new_a >= a && new_a % a == 0 && new_a != 0) {
            System.out.println("YES");
            return;
        }

        int new_b = a + (c - a) / 2;
        if (new_b >= b && (c - a) % 2 == 0 && new_b % b == 0 && new_b != 0) {
            System.out.println("YES");
            return;
        }

        int new_c = a + 2 * (b - a);
        if (new_c >= c && new_c % c == 0 && new_c != 0) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
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