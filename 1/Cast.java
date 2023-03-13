public class Cast {
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.08;         // 消費税率：8%
        int amount;

        amount = (int)(price * (1 + rate));  //62bitのrateを、32bitのint型へ代入するため、キャストを行っている
        System.out.println("税込金額：" + amount + "円");
    }
}
