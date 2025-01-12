import java.util.*;

public class Problem1992B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int maxidx = 0;
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            list.add(a);
            if (list.get(maxidx) < a)
                maxidx = i;
        }
        int operations = 0;
        for (int i = 0; i < k; i++) {
            int curr = list.get(i);
            if (i != maxidx) {
                if (curr == 1) {
                    operations++;
                } else {
                    operations += list.get(i) + list.get(i) - 1;
                }
            }
        }
        System.out.println(operations);
    }

}
