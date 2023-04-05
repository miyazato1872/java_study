public class Baseball implements Englishable{  //インターフェースを実装したクラス
    public void display(){
        System.out.println("キャッチボール");
        System.out.println("シートノック");
        System.out.println("バッティング");
    }
    public void displayEng(){ //インターフェースの抽象メソッドをオーバーライド
        System.out.println(Englishable.LANGUAGE);
        System.out.println("catch ball");
        System.out.println("seat knock");
        System.out.println("batting practice");
    }
}
