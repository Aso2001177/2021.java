import java.util.Scanner;
public class Ship {
    public String x;
    public String y;

    Scanner scanner = new Scanner(System.in);

    public void zahyou(String x,String y){
        System.out.println("爆弾のx座標を入力してください（1-5）");
        x = scanner.nextLine();
        System.out.println("爆弾のx座標を入力してください（1-5）");
        y = scanner.nextLine();
    }
}
