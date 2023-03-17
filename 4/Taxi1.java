public class Taxi1 extends Car1 {  //サブクラス。Car1クラスを継承している状態
    //メンバ変数(属性)
    private int price;

    //メソッド(操作)
    public void start() {
        price = 420;
    }
    public void run() {
        price = price + 80;
    }
    public void display() {  //オーバーライドでCar1クラスのdisplayメソッドを上書きしている
        System.out.println("料金は" + price + "円です");
    }
}
