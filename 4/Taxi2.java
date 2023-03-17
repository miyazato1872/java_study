public class Taxi2 extends Car2 {  //サブクラス
    //メンバ変数(属性)
    private int price;

    //メソッド(操作)
    public Taxi2(int no) {
        this(no, 0);  //this()の記述によって、このクラスのコンストラクタを呼び出している。このクラスのコンストラクタは、下のメソッドのTaxi2のことを指す
    }
    public Taxi2(int no, int price) {
        super(no);//この記述によって、スーパークラスのコンストラクタを呼び出している。スーパークラスのコンストラクタはCar2クラスのCar2メソッドのこと。
        this.price = price;
    }

    public void start() {
        price = 420;
    }
    public void run() {
        price = price + 80;
    }
    public void display() {
        super.display(); //スーパークラスのメソッドを使っている
        System.out.println("料金は" + price + "円です");
    }
}

