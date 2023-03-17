public class StuSample4{   //実行クラス
    public static void main(String[] args){
        final int BASE_NO = 1000;  //finalキーワード。定数にしているので、値を以降は代入できない
        Student4 stu1 = new Student4("菅原",BASE_NO+1);
        stu1.display();
        Student4 stu2 = new Student4("村山",BASE_NO+2);
        stu2.display();
    }
}
