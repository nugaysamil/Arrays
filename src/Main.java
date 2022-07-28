import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //int[] a = new int[10]; // bir aray tanımladık ve içinde 10 tane eleman var.

        //a[5] = 32;
        //a[9] = 10; // a'nin 10. elemanına 10 sayisini ekle

        /************************************************************************/

        // int[] a = {30,40,50,60,70};

        // System.out.println(a[0]);

        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in) {

            for ( int i = 0 ; i < 5; i ++) {

            a[i] = scanner.nextInt();
            }

        }

        for(int i = 0; i<5; i++) {

             a[i] = i * 10  ;

        }
        for(int i = 0; i< 5; i++) {

            System.out.println(a[i]);






    }
    }
}

