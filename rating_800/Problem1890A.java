import java.util.*;

public class Problem1890A {
    private static String solution(int[] array, int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : array) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        if (freq.size() == 1)
            return "YES";
        if (freq.size() == 2) {
            for (Integer key : freq.keySet()) {
                if (freq.get(key) == (n / 2)) {
                    return "YES";
                }
            }
        }

        return "NO";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solution(arr, n));
        }
        sc.close();
    }
}
