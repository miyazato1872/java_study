public class Student3 extends Person3{
    private int stuNo;

    public Student3(String name){  //コンストラクタ
        this(name, 999);  //nameは7行目を呼び出している
    }
    public Student3(String name, int stuNo){  //コンストラクタ
        super(name);
        this.stuNo = stuNo;
    }
    public void display(){
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}
