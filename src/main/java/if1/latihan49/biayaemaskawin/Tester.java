/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan49.biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi menentukan biaya emas kawin dengan
 *                     pendekatan object oriented
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Tester {
    public static void main(String[] args) {
        EmasKawin mk = new EmasKawin();
        mk.setBerat(15.7);
        mk.setHarga(570000);
        
        
        DecimalFormat kurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("Rp. ");
        symbol.setGroupingSeparator('.');
        
        kurs.setDecimalFormatSymbols(symbol);
        System.out.println("===Perhitungan Biaya Emas Kawin===");
        System.out.println("Berat Emas : " + mk.getBerat() + " gram");
        System.out.println("Harga Emas : ".concat(kurs.format(mk.getHarga())).replaceAll(",00", "").concat(" / gram / bulan Oktober"));
        System.out.println("\nTotal biaya : ".concat(kurs.format(mk.totalHarga())).replaceAll(",00", ""));
    }
}