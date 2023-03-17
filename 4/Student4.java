public final class Student4 extends Person4{   //サブクラス
    private int stuNo;

    public Student4(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }
    public void display(){  //オーバーライド(スーパークラスのメソッドを上書き)
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}
