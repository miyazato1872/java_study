import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //処理を繰り返したい回数
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String s = sc.next();  //工事の開始時刻 13:00
            String[] str = s.split(":"); //str[0]は時間　str[1]は分数になる
            int h = sc.nextInt();  //工事の所要時間 1を取得
            int m = sc.nextInt();  //工事の所要分 30を取得

            int hTime = Integer.parseInt(str[0]) + h; //開始時間に所要時間をプラス
            int mTime = Integer.parseInt(str[1]) + m; //開始分に所要分をプラス

            if (mTime >= 60) {  //分が60を超えた場合、分を-60(65分なら5分)にして、時間に+1する(分が60超えて繰り上がった分をプラス)
                mTime -= 60;
                hTime +=  1;
            }
            if (hTime >= 24) { //時間が24時を超えた場合、0時にしたいので、24以上になった場合24-24で0時表記にしている
                hTime -= 24;
            }
            if (Integer.toString(hTime).length() == 1) {  //hTimeの文字数が1桁の場合(例えば1時の場合、01時の表記にするためのif文)
                System.out.print("0"  + hTime + ":");
            } else {
                System.out.print(hTime + ":");  //printlnではなくて、printにすることで、改行をせずに次のprintlnを繋げている
            }

            if (Integer.toString(mTime).length() == 1) { //mTimeの文字数が1桁の場合(例えば5分の場合、05分表記にするためのif文)
                System.out.println("0" + mTime);
            } else {
                System.out.println(mTime);  //前の出力結果がprintなので後ろにそのままひっついて出力される
            }
        }
    }
}