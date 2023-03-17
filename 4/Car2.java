public class Car2{  //スーパークラス
    private int no;

    //メソッド
    public Car2(int no){
        this.no = no;  //thisキーワードで、左側は2行目のno変数を表している
    }
    public void display(){
        System.out.println("ナンバーは" + no + "です");
    }
}
