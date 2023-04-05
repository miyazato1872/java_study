public class StuSample5{
    public static void main(String[] args){
        Student5 stu1 = new Student5("菅原",1);
        Person5 psn = stu1;  //サブクラスからスーパークラスに代入しているので、自動で型変換が行われる
        psn.display();  //サブクラス(Student5)のdisplayメソットがオーバーライドで呼び出される
//        psn.chgStuNo(1001);

    /* 補足：instanceofキーワード
       オブジェクトのクラスを特定する
       対象オブジェクト instanceof クラス名 */
//        if(psn instanceof Student5){
//            Student5 stu2 = psn;
//            stu2.chgStuNo(1001);  //サブクラスの型への型変換をしているので使える
//            stu2.display();
//        }
    }
}
