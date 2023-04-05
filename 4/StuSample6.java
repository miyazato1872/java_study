public class StuSample6{  //実行用クラス
    public static void main(String[] args){
        TandF taf = new TandF("陸上競技部");  //オブジェクト生成
        Football fb = new Football("サッカー部");  //オブジェクト生成

        Student6 stu1 = new Student6("菅原",taf);  //上記で作った陸上部のオブジェクトを、Student6のデータ型の変数に代入している生成
        stu1.display();
        stu1.practice();
        Student6 stu2 = new Student6("桜井",fb);  //上記で作ったサッカー部のオブジェクトを、Student6のデータ型の変数に代入している生成
        stu2.display();
        stu2.practice();

    }
}
