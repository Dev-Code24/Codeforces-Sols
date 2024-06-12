import java.util.Scanner;

public class Problem1881A {
    private static void solve(String x, String s) {

        for (int i = 0; i < 6; i++) {
            if (x.contains(s)) {
                System.out.println(i);
                return;
            }
            x += x;
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            @SuppressWarnings("unused")
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();
            solve(x, s);
        }
        sc.close();
    }

}
