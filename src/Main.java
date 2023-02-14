import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değerini giriniz : ");
        int base = scanner.nextInt();

        System.out.println("Üs değerini giriniz : ");
        int exponent = scanner.nextInt();
        int result = 1 ;

        result = power(base, exponent);
    
        System.out.println("Sonuç : " + result);
    }
    public static int power (int base , int exponent) {

        if (exponent > 0) {
            exponent -- ;
            return base * power(base,exponent);

        }else {
            return 1;
        }

    }
}