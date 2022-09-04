package fahmi_fundamentals;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            try {
                System.out.print( "\nInput Nilai Angka: " );
                long x = scan.nextLong();
                System.out.println(x + " dapat dipasang di tipe data:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " tidak dapat dipasang di tipe data manapun.");
            }
        }
        scan.close();
    }
}


