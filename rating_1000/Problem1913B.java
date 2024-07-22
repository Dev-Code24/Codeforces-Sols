import java.util.*;

/*
 * The quesiton is very basic.... I just was not understanding the question properly
 * This problem can be solved greedily
 * The problem ask us to create a string t from the given string s
 * such that s[i] ≠ t[i] now since s is a binary string, this means 
 * if s[i] = 1 then t[i] must be = 0 or visa verca
 * Thus what we can do is first keep a count of 1`s and 0`s in String s
 * and then iterate till s.length(), and while iterating 
 * we can just decrease the count of 0`s by 1 if s[i] = 1
 * and decrease the count of 1`s by 1 if s[i] = 0
 */

public class Problem1913B {
    public static void solve(Scanner sc) {
        String s = sc.next();
        int zeroes = 0, ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeroes++;
            } else {
                ones++;
            }
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                ones--;
            } else {
                zeroes--;
            }

            if (zeroes < 0 || ones < 0) {
                ans = s.length() - i;
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
    /*
     * private static long gcd(long a, long b) {
     * while (b != 0) {
     * long temp = b;
     * b = a % b;
     * a = temp;
     * }
     * return a;
     * }
     * private static long lcm(long a, long b) {
     * return a * b / gcd(a, b);
     * }
     */
}