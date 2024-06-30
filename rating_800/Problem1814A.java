import java.util.Scanner;

public class Problem1814A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("YES");
        else if (k % 2 != 0)
            System.out.println("YES");
        else
            System.out.println("NO");
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
