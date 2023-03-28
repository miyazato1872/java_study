public class TandF extends Club{  //サブクラス(抽象クラスを引き継いでいる)
    public TandF(String name){
        super(name);
    }
    public void practice(){  //スーパークラスにオーバーライドをしている
        System.out.println("ウォームアップ");
        System.out.println("インターバル");
        System.out.println("筋肉トレーニング");
    }
}
