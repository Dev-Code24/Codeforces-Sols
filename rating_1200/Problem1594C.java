import java.util.*;

public class Problem1594C {
    static int n;
    static char c, carr[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        c = sc.next().toCharArray()[0];
        carr = sc.next().toCharArray();

        boolean flag = false;

        for (int i = 0; i < carr.length; i++) {
            if (carr[i] != c) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i <= n; i++) {
            flag = false;
            for (int j = i; j <= n; j += i)
                if (carr[j - 1] != c)
                    flag = true;
                    
            if (!flag) {
                System.out.println(1);
                System.out.println(i);
                return;
            }
        }

        System.out.println(2);
        System.out.println(n - 1 + " " + n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    // private static long gcd(long a, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static long lcm(long a, long b) {
    // return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    // long first;
    // long second;
    //
    // Pair(long _first, long _second) {
    // this.first = _first;
    // this.second = _second;
    // }
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // @Override
    // public String toString() {
    // return "(" + first + ',' + second + ")";
    // }
    // }
}