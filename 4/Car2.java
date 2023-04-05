public class Car2{
    private int no;

    public Car2(int no){  //コンストラクタ
        this.no = no;  //this.noはメンバ変数。noは引数
    }
    public void display(){
        System.out.println("ナンバーは" + no + "です");
    }
}