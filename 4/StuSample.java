public class StuSample{  //実行用クラス
    public static void main(String[] args){
        Student stu = new Student();

        // スーパークラスのメソッドを呼び出し
        stu.setName("菅原");
        stu.display();

        // サブクラスのメソッドを呼び出し
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
