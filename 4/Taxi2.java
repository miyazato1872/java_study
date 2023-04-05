public class Taxi2 extends Car2 {
    //メンバ変数
    private int price;

    //コンストラクタ
    public Taxi2(int no) {
        this(no, 0);  //this()で、このクラスのコンストラクタを呼び出すので、9行目のコンストラクタを呼び出して値を代入している
    }
    public Taxi2(int no, int price) {
        super(no);  //スーパークラスのコンストラクタを呼び出し
        this.price = price;
    }

    //メソッド
    public void start() {  //変数priceに420を設定
        price = 420;
    }
    public void run() {  //変数priceに80を加算
        price += 80;
    }
    public void display() {  //変数priceを表示
        super.display();  //スーパークラスのdisplayメソッドを呼び出している
        System.out.println("料金は" + price + "円です");
    }
}
