package pack;

public class Student8{  //設計図クラス
    private String name;  //メンバ変数

    public Student8(String name){  //コンストラクタ
        this.name = name;
    }
    public void display(){  //メソッド
        System.out.println("名前：" + name);
    }
}
