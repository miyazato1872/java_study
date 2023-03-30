import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String cards; //4桁の番号を入れる入れる変数

        for (int i  = 0; i < n; i++) {
            cards = sc.nextLine();  //1回目でcards[0]に、"7777"を代入
            String[] num = cards.split("");
            Arrays.sort(num);
            Judgment(num);
        }
    }
    public static void Judgment(String num[]) {
        if (Objects.equals(num[0], num[1]) && Objects.equals(num[1], num[2]) && Objects.equals(num[2], num[3])) {
            System.out.println("Four Card");
        } else if (Objects.equals(num[0], num[1]) && Objects.equals(num[1], num[2])) {
            System.out.println("Three Card");
        } else if (Objects.equals(num[1], num[2]) && Objects.equals(num[2], num[3])) {
            System.out.println("Three Card");
        } else if (Objects.equals(num[0], num[1]) && Objects.equals(num[2], num[3])) {
            System.out.println("Two Pair");
        } else if (Objects.equals(num[0], num[1]) || Objects.equals(num[1], num[2]) || Objects.equals(num[2], num[3])) {
            System.out.println("One Pair");
        } else {
            System.out.println("No Pair");
        }
    }
}


//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        String cards; //4桁の番号を入れる入れwつ
//
//        for (int i  = 0; i < n; i++) {
//            cards = sc.nextLine();  //1回目でcards[0]に、"7777"を代入
//            String[] num = cards.split("");
//            Arrays.sort(num);
//            if (Objects.equals(num[0], num[1]) && Objects.equals(num[1], num[2]) && Objects.equals(num[2], num[3])) {
//                System.out.println("Four Card");
//            } else if (Objects.equals(num[0], num[1]) && Objects.equals(num[1], num[2])) {
//                System.out.println("Three Card");
//            } else if (Objects.equals(num[1], num[2]) && Objects.equals(num[2], num[3])) {
//                System.out.println("Three Card");
//            } else if (Objects.equals(num[0], num[1]) && Objects.equals(num[2], num[3])) {
//                System.out.println("Two Pair");
//            } else if (Objects.equals(num[0], num[1]) || Objects.equals(num[1], num[2]) || Objects.equals(num[2], num[3])) {
//                System.out.println("One Pair");
//            } else {
//                System.out.println("No Pair");
//            }
//        }
//    }
//}