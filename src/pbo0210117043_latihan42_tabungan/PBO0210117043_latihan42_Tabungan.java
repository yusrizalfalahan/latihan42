/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan42_tabungan;
import java.util.Scanner;
/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN SALDO TABUNGAN
                        
 * @author Acer
 */


public class PBO0210117043_latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan saldo Awal: ");
        tabungan Tabungan = new tabungan(scn.nextInt());
        
        System.out.print("Jumlah yang mau di ambil: ");
        Tabungan.ambiluang(scn.nextInt());
        System.out.println("Saldo anda sekarang: " +Tabungan.ambiluang(0));
    }
    
}
