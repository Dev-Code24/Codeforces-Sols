import java.util.*;

public class Problem1665B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxFreq = Math.max(maxFreq, entry.getValue());
        }
        int ans = 0;
        while (maxFreq < n) {
            int d = Math.min(n - maxFreq, maxFreq);
            ans += 1 + d;
            maxFreq += d;
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
}