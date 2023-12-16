/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassObject;

/**
 *
 * @author Naufal whildan
 */
public class Main {
    public static void main (String[]args){
        Kendaraan mobil = new Kendaraan();
        mobil.nama ="Mobil";
        mobil.warna ="Merah";
        mobil.merk ="Toyota";
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merek Kendaraan : " + mobil.merk);
        System.out.println("Jumlah Roda : " + mobil.jmlRoda(4)+"\n");
        System.out.println("Cara kendaraan bergerak:");
        System.out.println("Saat maju : ");
        mobil.kendaraanMaju();
        System.out.println("Saat mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti : "+ mobil.nama);
        mobil.kendaraanBerhenti();
        
    }
    
}
