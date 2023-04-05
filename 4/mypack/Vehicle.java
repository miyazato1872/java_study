package mypack;

public abstract class Vehicle {  //スーパークラスで抽象クラス
    protected int crewNum;  //乗客人数。　protectedの意味は、継承していたらサブクラスまでアクセスOKの修飾子
    public abstract void showCrewNum();  //抽象メソッド
}
