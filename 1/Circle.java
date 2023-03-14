public class Circle {
    public static void main(String[] args){
        int radius = Integer.parseInt(args[0]);
        double pi = 3.141592;
        double area;

        area = radius * radius * pi;  //314.1592

        //小数点第３位以降を切り捨て
//        area = (Math.floor(area * 100)) / 100; これは習ってないので使わない
        area = (int)(area * 100);
        //上記の処理31415.92　ここで小数点が右に二つずれるそして、キャストでint型に変換するので、.92ががなくなり、31415になる
        area = area / 100;
        // 31415を/100することで、314.15になり、それをareaに代入した
        System.out.println("半径：" + radius);
        System.out.println("面積：" + area);
    }
}

