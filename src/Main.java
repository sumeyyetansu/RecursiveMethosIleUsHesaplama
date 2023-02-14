import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değerini giriniz : ");
        int base = scanner.nextInt();
        double total = 1;
        System.out.println("Üs değerini giriniz : ");
        int exponent = scanner.nextInt();
        double result = 1 ;
        if(exponent>= 0){
            result = power(base, exponent);
        }else {
            total = power(base, exponent);
            result = 1 / result;
        }

    
        System.out.println("Sonuç : " + result);
    }
    public static int power (int base , int exponent) {

        if (exponent > 0) {
            exponent -- ;
            return base * power(base,exponent);

        } else if (exponent < 0) {
            exponent++;
            return base * power(base,exponent);

        } else {
            return 1;
        }

    }
}