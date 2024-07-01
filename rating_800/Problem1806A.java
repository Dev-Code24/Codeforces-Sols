import java.util.Scanner;

public class Problem1806A {
    private static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // (a,b) -> (c,d)
        if (d < b) {
            System.out.println(-1);
            return;
        } else {
            int diff = Math.abs(d - b);
            a += diff;
            if (a < c)
                System.out.println(-1);
            else
                System.out.println(diff + Math.abs(c - a));
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
