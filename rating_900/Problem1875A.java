import java.util.*;

public class Problem1875A {
    private static void solve(Scanner sc) {
        int a = sc.nextInt(); // 5
        int b = sc.nextInt(); // 3
        int n = sc.nextInt(); // 3
        sc.nextLine();
        int[] arr = new int[n]; // 1 1 7
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int timer = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            timer += arr[i];
            if (timer > a)
                timer = a;
            sum += timer - 1;
            timer = 1;
        }
        System.out.println(sum + b);

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
