import java.util.*;

public class Problem1883B {
    // bacacd
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        int char_with_odd_occurence = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character ch : map.keySet()) {
            if (map.get(ch) % 2 != 0)
                char_with_odd_occurence++;
        }
        if (char_with_odd_occurence - k > 1)
            System.out.println("NO");
        else
            System.out.println("YES");
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
