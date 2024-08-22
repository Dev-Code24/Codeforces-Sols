import java.util.*;

public class Problem1352A {
    static int n;
    static List<Integer> ans;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        ans = new ArrayList<>();
        int size = 0;
        while (n > 0) {
            ans.add(n % 10);
            if (n % 10 != 0) {
                size++;
            }
            n /= 10;
        }
        Collections.reverse(ans);
        System.out.println(size);
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) != 0) {
                int num = ans.get(i) * (int) Math.pow(10, ans.size() - i - 1);
                System.out.print(num + " ");
            }
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