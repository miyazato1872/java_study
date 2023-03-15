class Car2 {
    //メンバ変数(属性)
    int no;  //自動車のナンバー
    int speed;  //自動車の速度

    //メソッド(操作)
    Car2() {  //コンストラクタのメソッドで、実行用ファイルで引数がない場合でもデフォルトの0で初期化できるようにしている
        no = 0;
    }
    Car2(int n) {  //コンストラクタのメソッドで、実行用ファイルで初期化できるようにしている
        no = n;
    }

    void run(int s) {
        speed = s;
    }
    void brake() {  //オーバーロード
        speed = 0;
    }
    void brake(int s) {  //オーバーロード
        speed -= s;
    }
    void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }

}