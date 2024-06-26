import java.util.Scanner;

public class Problem71A {
    private static void solve(String str) {
        if (str.length() <= 10) {
            System.out.println(str);
        } else {
            String res = "" + str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1);
            System.out.println(res);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String str = sc.next();
            sc.nextLine();
            solve(str);
        }

        sc.close();

    }
}