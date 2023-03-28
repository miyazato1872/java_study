class DriveTaxi{  //実行用クラス
    public static void main(String[] args){
        Car c = new Car();  //Carクラスのオブジェクト「c」を生成。System.out.println("Car()")によって、①【Car()】が出力
        System.out.println("-----");    //②【-----】を表示
        Taxi t1 = new Taxi(2525);   //Taxiクラスのオブジェクト「t1」を生成。引数2525があるため、TaxiクラスのTaxi(int no)のコンストラクタを実行。super(no)の記述によって、スーパークラスのCar(int no)が当てはまるので、処理、System.out.println("Car(int no)");を実行。【Car(int no)】が出力。
        System.out.println("-----");    //【-----】を表示
        Taxi t0 = new Taxi();           //Taxiクラスのオブジェクト「t0」を生成。引数は無しのため、TaxiクラスのTaxi()のコンストラクタを実行。this(9999)のため、同クラス内の下のTaxi(int no)のコンストラクタを実行。super(no)の記述によって、スーパークラスのCar(int no)が当てはまるので、処理、System.out.println("Car(int no)");を実行。【Car(int no)】が出力。その後、Taxi()コンストラクタ内のprintlnの実行内容である、【Taxi()】を出力して終了。
        System.out.println("-----");    //【-----】を表示
        Taxi t2 = new Taxi("2525"); //Taxiクラスのオブジェクト「t2」を生成。引数"2525"があるため、TaxiクラスのTaxi(String no)のコンストラクタを実行。他の場所でthis()やsuper()を使用しているので、ここではsuper();が自動で呼び出される動きになる。そのため、CarクラスのCar()が実行されて、System.out.println("Car()");によって、【Car()】が出力。その後、Taxi(String no)のprintlnが出力。【Taxi(String no)】が出力される。
    }
}

/*
Car()
-----
Car(int no)
Taxi(int no)
-----
Car(int no)
Taxi(int no)
Taxi()
-----
Taxi(String no)
 */
