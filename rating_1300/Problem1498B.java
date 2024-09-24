import java.util.*;

public class Problem1498B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int W = sc.nextInt();
            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
            map.put(W, N);

            for (int i = N - 1; i >= 0; i--) {
                int key = map.ceilingKey(arr[i]);

                if (map.get(key) == 1)
                    map.remove(key);
                else
                    map.put(key, map.get(key) - 1);

                map.put(key - arr[i], map.getOrDefault(key - arr[i], 0) + 1);
            }
            int res = N - map.getOrDefault(W, 0);

            System.out.println(res);
        }
        sc.close();
    }
}