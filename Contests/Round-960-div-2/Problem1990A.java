import java.util.*;

public class Problem1990A {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        boolean win = false;
        for (int key : map.keySet()) {
            if (map.get(key) % 2 == 1)
                win = true;
        }

        if (win)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    /*
     * private static long gcd(long a, long b) {
     * while (b != 0) {
     * long temp = b;
     * b = a % b;
     * a = temp;
     * }
     * return a;
     * }
     * private static long lcm(long a, long b) {
     * return a * b / gcd(a, b);
     * }
     */
}