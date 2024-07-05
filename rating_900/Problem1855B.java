import java.util.*;


// Again a really good problem
// The solutions are not at all tough but the thinking process
// is just something else
public class Problem1855B {
    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        int cnt = 1;
        while (n % cnt == 0) {
            cnt++;
            System.out.println(cnt);
        }
        System.out.println(--cnt);
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
