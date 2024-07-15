import java.util.*;

public class Problem1666D {
    private static void solve(Scanner sc) {
        String str = sc.next();
        String tar = sc.next();

        int s = str.length();
        int n = tar.length();

        int count = 0;
        int ct = 0;
        int[] b = new int[n];
        boolean[] used = new boolean[s];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = s - 1; j >= 0; j--) {
                if (tar.charAt(i) == str.charAt(j) && !used[j]) {
                    b[i] = j;
                    ct++;
                    used[j] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (b[i] < b[i + 1]) {
                count++;
            }
        }

        if (count == n - 1 && ct == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
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