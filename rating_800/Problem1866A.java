import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1866A {
    private static void solve(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        if (list.contains(0)) {
            System.out.println(0);
            return;
        }

        for (int num : list) {
            if (min > num)
                min = Math.min(Math.abs(num), min);
        }

        System.out.println(min);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        solve(list);
        sc.close();
    }
}
