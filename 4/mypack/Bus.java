package mypack;
public class Bus extends Vehicle implements Stopable{
    public Bus(int crewNum){  //コンストラクタ
        this.crewNum = crewNum;
    }
    public void showCrewNum(){  //乗客人数を表示
        System.out.println("バスの乗客：" + crewNum + "名");
    }
    public void stop(){ //オーバーライド
        System.out.println("次止まります");
    }
}
