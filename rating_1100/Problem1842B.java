import java.util.*;

// very clever solution, here x | abc[i][j] == x, if ≠ x, then that number
// will not be valid as x should be the value which is made
// when abc[k][l] | abc[i][j] =  x
public class Problem1842B {
    static int n, x;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();

        var abc = new ArrayList<ArrayList<Integer>>(3);

        int wannabex = 0;

        for (int i = 0; i < 3; i++) {
            abc.add(new ArrayList<>(n));
            for (int j = 0; j < n; j++) {
                abc.get(i).add(sc.nextInt());
            }
            for (int j = 0; j < n; j++) {
                if ((x | abc.get(i).get(j)) != x)
                    break;
                wannabex |= abc.get(i).get(j);
            }
        }
        if (wannabex == x)
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