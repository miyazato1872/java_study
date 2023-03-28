public class StuSample5{
    public static void main(String[] args){
        Student5 stu1 = new Student5("菅原",1);  //サブクラスのオブジェクトを生成
        Person5 psn = stu1;  //スーパークラスの変数psnにサブクラスの変数を代入している
        psn.display();  //Person5クラスから呼び出している。psnはPerson5クラスだけに干渉できる
        // psn.chgStuNo(1001);  //サブクラス独自のメソッドで、変数psnはスーパークラスのみ歯科干渉できないのでコンパイルエラーになる

    /* 補足：instanceofキーワード
       オブジェクトのクラスを特定することだできるキーワード
       対象オブジェクト instanceof クラス名 */
        if(psn instanceof Student5){  //変数psnは、Student5クラスのインスタンスですか？と聞いている記述
            Student5 stu2 = (Student5)psn;  //キャストを使用。しないとコンパイルエラーになる
            stu2.chgStuNo(1001);
            stu2.display();
        }
    }
}
