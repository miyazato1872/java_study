public class Football extends Club{ //サブクラス
    public Football(String name){  //コンストラクタ
        super(name);
    }
    public void practice(){  //抽象メソッドの中身
        System.out.println("ドリブル練習");
        System.out.println("シュート練習");
        System.out.println("ミニゲーム");
    }
}
