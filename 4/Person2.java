// スーパークラス
public class Person2{
    private String name;  //メンバ変数。名前

    public void setName(String n){  //name変数に値をセットするためのメソッド
        name = n;
    }
    public String getName(){  //name変数の値を取得するためのメソッド
        return name;
    }
    public void display(){  //name変数の値を表示するためのメソッド
        System.out.println("名前：" + name);
    }
}
