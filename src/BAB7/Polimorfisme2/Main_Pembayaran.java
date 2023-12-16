/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme2;

/**
 *
 * @author Naufal whildan
 */
public class Main_Pembayaran {
    public static void main (String[]args){
        Pembayaran payment;
        payment = new P0001();
        
        payment.tampilkanMember();
        
        if (payment instanceof P0001){
            P0001 p0001 = (P0001)payment;
               System.out.println("jenis member :"+p0001.member(p0001));
               System.out.println("Total Pembelian :"+p0001.hitPembayaran(500000));
               System.out.println("sisa saldo :"+p0001.potSaldo());
        }
    }
}
