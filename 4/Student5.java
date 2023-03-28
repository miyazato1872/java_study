public class Student5 extends Person5{  //サブクラス
    private int stuNo;

    public Student5(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }
    public void display(){  //オーバーライドしている
        super.display();  //スーパークラスのdisplayメソッドを実行
        System.out.println("学籍番号：" + stuNo);
    }
    public void chgStuNo(int stuNo){
        this.stuNo = stuNo;
    }
}
