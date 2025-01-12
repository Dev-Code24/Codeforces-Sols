import java.util.*;

/*
 * if a number is odd then adding even to will not change it's parity
 * If only 1 number is odd in the given array, then the complete array 
 * will be changed to an odd array
 */
public class Problem1993B {
    static int n;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        int odd = 0;
        long maxOdd = -1;
        List<Long> even_list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 1) {
                odd++;
                maxOdd = Math.max(maxOdd, a[i]);
            }
            if (a[i] % 2 == 0) {
                even_list.add((long) a[i]);
            }
        }

        if (odd == n || maxOdd == -1) {
            System.out.println(0);
            return;
        }

        long ans = 0;
        Collections.sort(even_list);
        for (int i = 0; i < even_list.size(); i++) {
            if (even_list.get(i) < maxOdd) {
                long temp = maxOdd;
                maxOdd = maxOdd + even_list.get(i);
                even_list.set(i, temp + even_list.get(i));
                ans = even_list.size();
            } else {
                ans = even_list.size() + 1;
                break;
            }
        }

        System.out.println(ans);

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