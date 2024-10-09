// 12S24052 - Indah Triyuni Siahimport java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double totalHarga, buku;

        totalHarga = 0;
        buku = 0;
        double termurah;

        termurah = 100;
        buku = Double.parseDouble(input.nextLine());
        while (buku != 0) {
            if (termurah <= buku) {
                buku = buku;
            } else {
                termurah = buku;
            }
            totalHarga = totalHarga + buku;
            buku = Double.parseDouble(input.nextLine());
        }
        if (totalHarga >= 100) {
            totalHarga = totalHarga - termurah;
        } else {
            totalHarga = totalHarga;
        }
        System.out.println(toFixed(totalHarga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
aan
// 12S24007 - Dasmauli Sormin

