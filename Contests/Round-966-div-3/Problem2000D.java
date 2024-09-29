import java.util.*;

/*
 * Watch this video to understand the problem properly as I still am unable to 
 * understand the problem: https://youtu.be/zy3Q2mxghac?t=1857
 * So now I finally understood the problem statement
 * The problem statement is that I can choose two indices l and r such that sl = 'L' & sr = 'R'
 * and after doing an operation I will be changing the 'L' and 'R' between l and r to '.'
 * Now this is just the basic statment, so lets use an example,
 * 
 * 1 2 3 4 5, after 1 op 1 2 3 4 5, sum = 7, 1 2 3 4 5, sum = 7 + 15
 * L R L R R, --->       L R . . R  ---->    . . . . .
 * 
 */
public class Problem2000D {
    static int n;
    static int a[];
    static String str;
    static int i, j;
    static long sum, score;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        str = sc.next();
        i = 0;
        j = n - 1;
        score = 0;

        while (i < j) {
            if (str.charAt(i) == 'R') {
                sum -= a[i++];
            } else if (str.charAt(j) == 'L') {
                sum -= a[j--];
            } else {
                score += sum;
                sum -= a[i++];
                sum -= a[j--];
            }
        }

        System.out.println(score);

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