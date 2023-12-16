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
public class P0001 extends Pembayaran {
    public String alamat;
    public String name;
    public int saldo;
    public String kode;
    double diskon,bayar,total;
    public P0001(){
    this.name = "P0001";
    this.saldo = 3000000;
    this.name ="Firman Frezy Pradana";
    this.alamat ="Malang,jl.singosari gangsinga no 3";
}
    public double hasil(){
        return diskon;
    }

    @Override
    double cekKode(String input) {
        if (input.compareTo(kode)== 0){
            diskon =0.3;
        }else{
            diskon = 0;
        }
        return diskon;
    }

    @Override
    double hitPembayaran(double bayar) {
      diskon = bayar * diskon;
      total = bayar-diskon;
      return total;
    }
    double potSaldo(){
        return this.saldo-total;
    }

    @Override
    void tampilkanMember() {
        System.out.println("Member P0001 dengan diskon 30%");
    }
}
