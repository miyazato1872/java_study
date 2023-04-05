public class StuSample2{
    public static void main(String[] args){
        Student2 stu = new Student2();
        stu.setName("菅原");  //スーパークラスのメソッド
        stu.setStuNo(1);  //サブクラスのメソッド
        stu.display();  // Student2型でオブジェクトを生成しているので、サブクラスであるStudent2クラスのdisplayメソッドが呼び出される
    }
}
