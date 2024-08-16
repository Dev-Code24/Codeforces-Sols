import java.util.*;

public class Problem2000C {
    static int n, m;
    static int template[];
    static String strings[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        template = new int[n];
        for (int i = 0; i < n; i++) {
            template[i] = sc.nextInt();
        }
        m = sc.nextInt();
        strings = new String[m];
        for (int i = 0; i < m; i++) {
            strings[i] = sc.next();
        }

        for (String s : strings) {
            if (s.length() != n) {
                System.out.println("NO");
                continue;
            }
            Map<Integer, Character> templateToString = new HashMap<>();
            Map<Character, Integer> stringToTemplate = new HashMap<>();
            boolean isMatch = true;

            for (int i = 0; i < n; i++) {
                int templateChar = template[i];
                char stringChar = s.charAt(i);

                if (templateToString.containsKey(templateChar)) {
                    if (templateToString.get(templateChar) != stringChar) {
                        isMatch = false;
                        break;
                    }
                } else {
                    templateToString.put(templateChar, stringChar);
                }

                if (stringToTemplate.containsKey(stringChar)) {
                    if (stringToTemplate.get(stringChar) != templateChar) {
                        isMatch = false;
                        break;
                    }
                } else {
                    stringToTemplate.put(stringChar, templateChar);
                }
            }

            if (isMatch) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    // private static long gcd(long a, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static long lcm(long a, long b) {
    // return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    // long first;
    // long second;
    //
    // Pair(long _first, long _second) {
    // this.first = _first;
    // this.second = _second;
    // }
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // @Override
    // public String toString() {
    // return "(" + first + ',' + second + ")";
    // }
    // }
}