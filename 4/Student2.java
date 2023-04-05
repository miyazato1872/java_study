//　サブクラス
public class Student2 extends Person2{
    private int stuNo;  //メンバ変数。学籍番号

    public void setStuNo(int s){  //sutNo変数に値をセットするためのメソッド
        stuNo = s;
    }
    public void display(){ //オーバーライド。nameとsutNoを表示するためのメソッド
        System.out.println("名前：" + getName());  //ここでスーパークラスのnameは使えない。理由は、nameはprivateだから
        System.out.println("学籍番号：" + stuNo);
    }
}

