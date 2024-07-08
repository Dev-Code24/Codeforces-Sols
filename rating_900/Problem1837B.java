import java.util.*;

public class Problem1837B {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int count1 = 0, count2 = 0, maxcount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '>') {
                count1++;
                count2 = 0;
                maxcount = Math.max(maxcount, count1);
            } else {
                count2++;
                count1 = 0;
                maxcount = Math.max(maxcount, count2);
            }
        }
        System.out.println(maxcount+1);
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
