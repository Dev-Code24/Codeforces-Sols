import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1877A {
    private static void solve(List<Integer> list) {
        int res = 0;
        for (int score : list) {
            res += score;
        }
        System.out.println(-res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>(n - 1);
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < n - 1; i++) {
                    list.add(sc.nextInt());
                }
            }
            solve(list);
        }
        sc.close();
    }
}
