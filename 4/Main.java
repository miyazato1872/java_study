import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] winNum = new String[6];  //当たり番号の配列

        for (int i = 0; i < 6 ; i++) {  //当たり番号を配列に代入していく
            winNum[i] = sc.next();
        }

        int n = sc.nextInt();  //くじの枚数
        sc.nextLine();
        String[] buyNum = new String[6]; //購入したくじの番号の配列
        for (int x = 0; x < n; x++) {
            for (int i = 0; i < 6; i++) {
                buyNum[i] = sc.next();  //ここで購入くじの番号を配列に代入
            }
            int count = 0;  //カウンタ変数
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (winNum[i].equals(buyNum[j])) {
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
