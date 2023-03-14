// 配列をfor文

public class Loop3 {
    public static void main(String[] args){
        int[] score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 75;
        String[] name = {"菅原", "村山", "寺島"};

        for(int i = 0; i < score.length; i++) {  //配列名.lengthと相性がいい。配列の数だけという意味
            System.out.println(name[i] + "さん：" + score[i] + "点");
        }
        System.out.println("受験者数：" + score.length + "名");
    }
}
