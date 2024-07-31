import java.util.*;

/*
 * This is a simple valid parenthesis problem from Leetcode, dont know why I was not able to solve it 
 * during the contest
 */
public class Problem1997C {
    static int n;
    static char c[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        c = sc.next().toCharArray();

        int sum = 0;
        Stack<Integer> open = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (c[i] == '(') {
                open.push(i);
            } else if (c[i] == ')') {
                sum += i - open.pop();
            } else {
                if (!open.isEmpty()) {
                    sum += i - open.pop();
                } else {
                    open.push(i);
                }
            }
        }

        System.out.println(sum);

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