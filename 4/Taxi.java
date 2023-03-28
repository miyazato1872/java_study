class Taxi extends Car{  //サブクラス。Carクラスを継承している
    Taxi(){
        this(9999);  //別のコンストラクタを呼び出して
        System.out.println("Taxi()");
    }
    Taxi(int no){
        super(no);
        System.out.println("Taxi(int no)");
    }
    Taxi(String no){
        /*super();　⬅︎上のコンストラクタでthis()やsuper()を使用しているので、ここではsuper();が自動で呼び出される動きになる。
         そのため、コードは書かれてないが、super();でによってCar();のメソッドを実行する*/
        System.out.println("Taxi(String no)");
    }
}
