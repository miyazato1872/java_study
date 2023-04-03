import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //人数
        sc.nextLine();
        int[] retention = new int[n];  //各々のボールの保持数の配列

        for (int i = 0; i < n; i++) {
            retention[i] = sc.nextInt();  //ボールの保持数
        }
        sc.nextLine();
        //　この時点で、配列retentionには、[0] =>1人目のボール保持数、、[1] =>2人目のボール保持数、[2] =>3人目のボール保持数がが入った
        int m =  sc.nextInt();  //パス回しの回数
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            int gives = sc.nextInt() - 1;  //渡す人のインデックス
            int receives = sc.nextInt() - 1;  //渡される人のインデックス
            int passNum =sc.nextInt();  //渡す数
            sc.nextLine();

            if (retention[gives] - passNum >= 0) {
                retention[gives] -= passNum;
                retention[receives] += passNum;
            } else {
                retention[receives] += retention[gives];
                retention[gives] -= retention[gives];
            }
        }
        for (int x : retention) {
            System.out.println(x);
        }
    }
}