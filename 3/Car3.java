class Car3 {
    //メンバ変数(属性)
    private int no;  //自動車のナンバー
    private int speed;  //自動車の速度

    //メソッド(操作)
    public Car3() {  //コンストラクタのメソッドで、実行用ファイルで引数がない場合でもデフォルトの0で初期化できるようにしている
        no = 0;
    }
    public Car3(int n) {  //コンストラクタのメソッドで、実行用ファイルで初期化できるようにしている
        no = n;
    }

    public void run(int s) {
        speed = s;
    }
    public void brake() {  //オーバーロード
        speed = 0;
    }
    public void brake(int s) {  //オーバーロード
        speed -= s;
    }
    public void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }

}