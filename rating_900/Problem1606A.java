import java.util.*;

// Follow the editorial for this problem
// https://codeforces.com/blog/entry/96454
public class Problem1606A {
    public static void solve(Scanner sc) {
        String s = sc.next();
        sc.nextLine();
        System.out.println(s.charAt(s.length() - 1) + s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}