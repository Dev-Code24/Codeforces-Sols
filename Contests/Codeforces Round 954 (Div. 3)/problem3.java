import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 

        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] ind = new int[m];
        for (int i = 0; i < m; i++) {
            ind[i] = sc.nextInt();
        }
        sc.nextLine();

        Arrays.sort(ind);
        int[] uniqueInd = Arrays.stream(ind).distinct().toArray();

        String c = sc.nextLine();
        char[] cArr = c.toCharArray();
        Arrays.sort(cArr);

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < uniqueInd.length; i++) {
            sb.setCharAt(uniqueInd[i] - 1, cArr[i]);
        }

        System.out.println(sb.toString());
    }

}
