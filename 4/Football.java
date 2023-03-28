public class Football extends Club{  //サブクラス(抽象クラスを引き継いでいる)
    public Football(String name){
        super(name);
    }
    public void practice(){  //スーパークラスにオーバーライドをしている
        System.out.println("ドリブル練習");
        System.out.println("シュート練習");
        System.out.println("ミニゲーム");
    }
}
