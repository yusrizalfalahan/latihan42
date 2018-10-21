/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan42_tabungan;

/**
 *
 * @author Acer
 */
public class tabungan {
    private int saldo;
    
    public tabungan(int saldo){
        this.saldo = saldo;
        
    }
   public int ambiluang(int jumlah){
       saldo = saldo - jumlah;
       return saldo;
   } 
}
    

