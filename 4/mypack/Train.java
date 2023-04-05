package mypack;
public class Train extends Vehicle{  //サブクラス
    public Train(int crewNum){  //コンストラクタ
        this.crewNum = crewNum;
    }
    public void showCrewNum(){  //乗客人数を表示
        System.out.println("電車の乗客：" + crewNum + "名");
    }
}
