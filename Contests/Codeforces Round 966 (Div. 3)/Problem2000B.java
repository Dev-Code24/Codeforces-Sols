import java.util.*;

public class Problem2000B {
    static int n;
    static int passengerSat[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        passengerSat = new int[n];
        for (int i = 0; i < n; i++) {
            passengerSat[i] = sc.nextInt();
        }

        int seats[] = new int[n + 1];
        seats[passengerSat[0]] = 1;
        for (int i = 1; i < n; i++) {
            seats[passengerSat[i]] = 1;
            // System.out.println(Arrays.toString(seats));
            if (passengerSat[i] + 1 <= n) {
                if (seats[passengerSat[i] - 1] == 0 && seats[passengerSat[i] + 1] == 0) {
                    // System.out.println("NO ->" + passengerSat[i]);
                    System.out.println("NO");
                    return;
                }
            } else {
                if (seats[passengerSat[i] - 1] == 0) {
                    // System.out.println("NO ->" + passengerSat[i]);
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
        // System.out.println("____");

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