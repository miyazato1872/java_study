public class Student7 implements Englishable{  //インターフェースを実装したクラス
    private String name;

    public Student7(String name){  //コンストラクタ
        this.name = name;
    }
    public void display(){
        System.out.println("名前：" + name);
    }
    public void displayEng(){  //インターフェースの抽象メソッドをオーバーライド
        System.out.println(Englishable.LANGUAGE);
        System.out.println("Name：" + name);
    }
}
