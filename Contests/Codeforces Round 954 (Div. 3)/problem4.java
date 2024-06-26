import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            f(sc);
        }
        sc.close();
    }

    public static void f(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String s = sc.nextLine();

        if (n == 2) {
            int sum = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
            System.out.println(sum);
            return;
        }
        if (n == 3) {
            int a = s.charAt(0) - '0';
            int b = s.charAt(1) - '0';
            int c = s.charAt(2) - '0';
            int ans1 = Math.min((a * 10 + b) + c, (b * 10 + c) + a);
            int ans2 = Math.min((a * 10 + b) * c, (b * 10 + c) * a);
            System.out.println(Math.min(ans1, ans2));
            return;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0' && n != 3 || s.charAt(n - 1) == '0') {
                System.out.println("0");
                return;
            }
            int sum = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
            int j = 0;
            while (j < n) {
                if (j != i && j != i + 1 && s.charAt(j) != '1') {
                    sum += s.charAt(j) - '0';
                }
                j++;
            }
            ans = Math.min(sum, ans);
        }
        System.out.println(ans);
    }
}
