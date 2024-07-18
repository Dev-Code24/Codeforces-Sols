import java.util.*;
//
public class Problem1607B {
    public static void solve(Scanner sc) {
        long x0 = sc.nextLong();
        long n = sc.nextLong();
        long d;
        if (n % 4 == 0) {
            d = 0;
        } else if (n % 4 == 1) {
            d = -n;
        } else if (n % 4 == 2) {
            d = 1;
        } else { 
            d = n + 1;
        }

        if (x0 % 2 == 0) {
            System.out.println(x0 + d);
        } else {
            System.out.println(x0 - d);
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