public class TandF extends Club{  //サブクラス
    public TandF(String name){  //コンストラクタ
        super(name);
    }
    public void practice(){  //抽象メソッドの中身
        System.out.println("ウォームアップ");
        System.out.println("インターバル");
        System.out.println("筋肉トレーニング");
    }
}
