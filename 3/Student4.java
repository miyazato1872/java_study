class Student4{
    String name;
    static int counter = 0;

    Student4(String n){
        name = n;
        counter++;
        System.out.println(name + "さんをインスタンス化しました");
    }
    static void display(){   //staticをつけることで、インスタンス化をしていなくても、display呼び出せるようになる
        System.out.println(counter + "人です");   //つまり、0人でも呼び出して表示させることができる
    }
}