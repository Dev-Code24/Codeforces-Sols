import java.util.*;

public class Problem1837A {
    private static void solve(Scanner sc) {
        int x = sc.nextInt();
        int k = sc.nextInt();
        if (x % k != 0) {
            System.out.println(1);
            System.out.println(x);
        } else {
            System.out.println(2);
            System.out.println(1 + " " + (x - 1));
        }
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
