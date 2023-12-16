/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6.Abstract;

/**
 *
 * @author Naufal whildan
 */
public class Mobil extends Kendaraan{
int roda = 4;
    @Override
     public int jumlahroda() {
       System.out.println("Mobil Memiliki Roda berjumlah : "+roda); 
       return roda;
    }
    
}
