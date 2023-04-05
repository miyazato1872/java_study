public class StuSample7{  //実行用クラス
    public static void main(String[] args){
        Student7 stu = new Student7("Mike");  //Student7クラスのオブジェクトを生成
        stu.displayEng();  //Student7クラスのdisplayEngメソッドを呼び出し。オブジェクト生成の際に引数でnameは渡している

        Baseball bb = new Baseball();   //Baseballクラスのオブジェクトを生成
        bb.displayEng();   //BaseballクラスのdisplayEngメソッドを呼び出し
    }
}
