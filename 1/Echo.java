public class Echo {
    public static void main(String[] args){
        //コマンドラインの入力文字列を表示（for文）
        for (int i = 0; i < args.length; i++) {  //args.lengthは、変数argsに入っている要素数の数となる
            System.out.println(args[i]);
        }
    }
}
