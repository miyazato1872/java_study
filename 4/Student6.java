public class Student6{  //各クラブの情報を扱うクラス(ポリモフィズムの性質のクラス)
    private String name;     // 氏名
    private Club club;       // Clubオブジェクト

    public Student6(String name, Club club){
        this.name = name;
        this.club = club;
    }
    public void display(){
        System.out.println("名前：" + name);
        club.display();
    }
    public void practice(){
        club.practice();
    }
}
