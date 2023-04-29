import java.util.Scanner;

/**
 * ClassName: KdvTutari
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 4/29/2023 6:43 PM
 * @Version 1.0
 */
public class KdvTutari {
    public static void main(String[] args) {
        System.out.println("Ürün Turarı Giriniz");
        double tutar,kdvorani = 0.18,kdvtutari,kdvlitutar,kdvorani2=0.08;
        Scanner input = new Scanner(System.in);
        tutar = input.nextDouble();
        if (tutar<1000) {
            kdvtutari = tutar * kdvorani;
            kdvlitutar = kdvtutari + tutar;
            System.out.println("KDVsiz tutar: " + tutar);
            System.out.println("KDVli turar: " + kdvlitutar);
            System.out.println("KDV tutari: " + kdvtutari);
        }else{
            kdvtutari = tutar * kdvorani2;
            kdvlitutar = kdvtutari + tutar;
            System.out.println("KDVsiz tutar: " + tutar);
            System.out.println("KDVli turar: " + kdvlitutar);
            System.out.println("KDV tutari: " + kdvtutari);

        }
    }
}
