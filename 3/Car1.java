class Car1 {
    //メンバ変数(属性)
    int no;
    int speed;

    //メソッド(操作)
    void setNo(int n) {
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
