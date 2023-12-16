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
public class G0001 extends Pembayaran{
    public String alamat;
    public String name;
    public int saldo;
    public String kode;
    double diskon,bayar,total;
    public G0001(){
    this.name = "G0001";
    this.saldo = 5000000;
    this.name ="Mohammad Ridho";
    this.alamat ="Malang,jl.Lowokwaru no 50";
}
    public double hasil(){
        return diskon;
    }

    @Override
    double cekKode(String input) {
        if (input.compareTo(kode)== 0){
            diskon =0.2;
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
        System.out.println("Member G0001 dengan diskon 20%");
    }
}
