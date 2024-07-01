import java.util.Scanner;

public class Problem1814A {
    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        String res = n % 2 == 0 || k % 2 != 0 ? "YES" : "NO";
        System.out.println(res);
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
