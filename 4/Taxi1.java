public class Taxi1 extends Car1 {
    //メンバ変数
    private int price;

    //メソッド
    public void start() {  //変数priceに420を設定
        price = 420;
    }
    public void run() {  //変数priceに80を加算
        price += 80;
    }

    public void display() {  //変数priceを表示
        System.out.println("料金は" + price + "円です");
    }
}
