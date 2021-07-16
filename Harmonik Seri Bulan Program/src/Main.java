import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in) ;
       System.out.print("N sayısını Giriniz :");
        int n = input.nextInt();
        double result = 0.0;

        for (double i=1 ; i<=n ; i++ ) {
            result += (1/ i) ;
        }System.out.println("result :"+result );


        //while döngüsü ile yapılırsa ;
        /*
        System.out.println("N sayısını giriniz :");
        double n = input.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println(result);
 */
    }
}


