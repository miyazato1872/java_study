public abstract class Club{  //スーパークラス(抽象クラス)
    private String name;     // 部活名

    public Club(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("部活動：" + name);
    }
    public abstract void practice();  //抽象メソッド。サブクラスで抽象メソッドを上書きして中身を実装する必要がある
}
