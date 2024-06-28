import java.util.Scanner;

public class Problem1858A {
    private static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + c - (c / 2)) > (b + (c / 2)))
            System.out.println("First");
        else
            System.out.println("Second");
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
