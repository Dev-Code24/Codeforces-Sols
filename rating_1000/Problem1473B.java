import java.util.*;

public class Problem1473B {
    static String S, T;

    public static void solve(Scanner sc) {
        S = sc.next();
        T = sc.next();
        int s = S.length();
        int t = T.length();

        int g = gcd(s, t);
        String mulS = mul(S, t / g);
        String mulT = mul(T, s / g);

        if (mulS.equals(mulT)) {
            System.out.println(mulS);
        } else {
            System.out.println("-1");
        }

    }

    private static String mul(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            res.append(s);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // private static int lcm(int a, int b) {
    //     return a * b / gcd(a, b);
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