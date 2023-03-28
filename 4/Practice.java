import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //繰り返す回数が渡される

        String data;
        for(int i = 0; i < n; i++) {
            data = sc.nextLine();
            System.out.println(data);
        }
    }
}