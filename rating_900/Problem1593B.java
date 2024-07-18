import java.util.*;

public class Problem1593B {
    private static final String[] subseqs = { "00", "25", "50", "75" };
    private static final int INF = 100;

    private static void solve(Scanner sc) {
        String n = sc.next();
        sc.nextLine();
        int ans = INF;

        for (String e : subseqs) {
            ans = Math.min(ans, helper(n, e));
        }

        System.out.println(ans);
    }

    private static int helper(String s, String t) {
        int sptr = s.length() - 1;
        int ans = 0;

        while (sptr >= 0 && s.charAt(sptr) != t.charAt(1)) {
            sptr--;
            ans++;
        }

        if (sptr < 0)
            return INF;

        sptr--;

        while (sptr >= 0 && s.charAt(sptr) != t.charAt(0)) {
            sptr--;
            ans++;
        }

        return sptr < 0 ? INF : ans;
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