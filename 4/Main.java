import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] num = new int[n];

        for (int i = 0; i < n ; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        int[] descending = new int[n];

        for (int i = 0; i < n; i++) {
            descending[i] = num[n - i - 1];
        }

        for (int x : descending) {
            System.out.println(x);
        }
    }
}