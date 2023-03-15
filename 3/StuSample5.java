class StuSample5{
    public static void main(String[] args){
        Student5 stu1 = new Student5("菅原");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("村山");
        stu2.setScore(-50);  //範囲外の数値をあえて設定
//      stu2.score = -50;
        stu2.display();
    }
}
