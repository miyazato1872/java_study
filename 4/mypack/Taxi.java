package mypack;
public class Taxi extends Vehicle implements Stopable{  //サブクラス
    public Taxi(int crewNum){  //コンストラクタ
        this.crewNum = crewNum;
    }
    public void showCrewNum(){  //乗客人数を表示
        System.out.println("タクシーの乗客：" + crewNum + "名");
    }
    public void stop(){ //オーバーライド
        System.out.println("ここで降ります");
    }
}
