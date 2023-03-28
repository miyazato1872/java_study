public class Student6{  //ポリモフィズムの考えで作成されたクラス
    private String name;     // 氏名
    private Club club;       // Clubオブジェクト

    public Student6(String name, Club club){
        this.name = name;
        this.club = club;
    }
    public void display(){
        System.out.println("名前：" + name);
        club.display();  //Clubクラスのdisplayメソッドを使える
    }
    public void practice(){
        club.practice();
    }
}

