public abstract class Club{  //スーパークラス(抽象クラス)
    private String name;     // 部活名

    public Club(String name){  //コンストラクタ
        this.name = name;
    }
    public void display(){
        System.out.println("部活動：" + name);
    }
    public abstract void practice();  //抽象メソッド
}
