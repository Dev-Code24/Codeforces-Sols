import java.util.*;

// Read about TreeMaps in java
public class Problem1582C {
    static int INT_MAX = Integer.MAX_VALUE;
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();

        int ans = INT_MAX;
        for (char c = 'a'; c <= 'z'; c++) {
            boolean breakFlag = false;
            int left = 0, right = n - 1;
            int cnt = 0;
            while (left < right) {
                char c1 = s.charAt(left);
                char c2 = s.charAt(right);
                if (c1 != c2) {
                    if (c1 == c || c2 == c) {
                        cnt++;
                        if (c1 == c) {
                            left++;
                            continue;
                        }
                        if (c2 == c) {
                            right--;
                            continue;
                        }
                    } else {
                        breakFlag = true;
                        break;
                    }
                } else {
                    left++;
                    right--;
                }

            }
            if (breakFlag)
                continue;
            ans = Math.min(ans, cnt);
        }

        System.out.println(ans != INT_MAX ? ans : -1);
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