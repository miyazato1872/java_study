public class Student5{
    private String name;
    private int score;  //ここにprivateでカプセル化をしていない場合、実行用クラスから変数scoreに直接値を代入できてしまう。　そうすると、setScoreで不正な値を防いでいたのができなくなる

    public Student5(String n){  //コンストラクタ(初期化できる)
        name = n;
    }
    public void setScore(int s){
        if(0 <= s && s <= 100){  //不正な値を防ぐためのif文
            score = s;
        } else {
            System.out.println(name + "さんの点数が範囲外です");
            score = 0;
        }
    }
    void display(){
        System.out.println(name + "さん：" + score + "点");
    }
}
