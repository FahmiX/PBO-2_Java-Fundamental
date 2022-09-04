package fahmi_fundamentals;

import java.util.Scanner;
    
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Input Nilai String A: " );
        String A = sc.next();
        System.out.print( "Input Nilai String B: " );
        String B = sc.next();
        System.out.println();
        sc.close();

        // Jumlah panjang string A dan B
        System.out.println("1. Panjang String A dan B adalah: " + (A.length() + B.length()) + " karakter\n");

        // Apakah String A lebih besar daripada String B secara leksikografis
        System.out.println("2. Apakah String A lebih besar daripada String B secara leksikografis? \n" + 
                                    ((A.compareTo(B) > 0) ? "   => Iya\n" : "   => Tidak\n"));

        // Kapitalisasi Huruf Awal
        System.out.println("3. Kapitalisasi Huruf Awal String A + String B: \n   => " + 
                                    (A.substring(0, 1).toUpperCase() + A.substring(1) + " " +B.substring(0, 1).toUpperCase() + B.substring(1)));
    }
}



