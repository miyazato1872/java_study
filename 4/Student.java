//サブクラス。extends Personによって、Personクラスの変数とメソッドが使える

public class Student extends Person{
    private int stuNo;

    public void setStuNo(int s){
        stuNo = s;
    }
    public void displayStuNo(){
        System.out.println("学籍番号：" + stuNo);
    }
}
