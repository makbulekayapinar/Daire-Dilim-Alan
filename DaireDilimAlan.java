import java.util.Scanner;
public class DaireDilimAlan {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçap Giriniz: ");
        r = input.nextInt();

        System.out.println("Merkez Açı Ölçüsü Giriniz: ");
        alfa = input.nextInt();

        double daireDilimiAlani =(pi*(r*r)*alfa)/360;
        System.out.println("Daire Diliminin Alanı:" + daireDilimiAlani);



    }
}
