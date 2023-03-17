public class DriveTaxi1{  //実行用クラス
    public static void main(String[] args){
        Taxi1 t1 = new Taxi1(); //サブクラスTaxi1のオブジェクトを生成
        t1.setNo(2525);  //スーパークラスのメソッド
        t1.start();
        t1.run();
        t1.display();  //オーバーライドしたTaxi1のサブクラスのdisplayを使っている
    }
}
