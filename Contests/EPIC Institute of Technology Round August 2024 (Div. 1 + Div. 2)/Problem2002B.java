import java.util.*;

/*
 * If there exist two arrays p and q, and two elements x and y such that these are adjacent to 
 * each other in array p but not adjcent in array q, then Alice wins in this case 
 * but what if no such x and y exist ?
 * if q = p or q = rev(p), then bob will win because, whenever Alice removes something from the front or
 * the end of her array, bob can remove the same thing from the front or the end his array
 * 
 */
public class Problem2002B {
    static int n;
    static List<Integer> a;
    static List<Integer> b;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new ArrayList<>();
        b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());

        }
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        if (a.equals(b)) {
            System.out.println("Bob");
            return;
        }
        Collections.reverse(a);
        if (a.equals(b)) {
            System.out.println("Bob");
            return;
        }

        System.out.println("Alice");

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