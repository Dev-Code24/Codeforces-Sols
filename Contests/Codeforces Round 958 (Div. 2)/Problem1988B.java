import java.util.*;

public class Problem1988B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        sc.nextLine();

        int count1 = 0, count0 = 0;
        int j = 0;
        while (j < n) {
            if (a[j] == '0') {
                count0++;
                while (j < n && a[j] == '0') {
                    j++;
                }
            } else {
                count1++;
                j++;
            }
        }
        if (count0 >= count1) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        return;

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