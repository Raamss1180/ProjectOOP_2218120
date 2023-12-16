/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.Konstruktor;

/**
 *
 * @author Naufal whildan
 */
public class Data_Matkul {
    String kode_mk,nama_mk,dosen_pengampu;
    int jml_sks;
    public Data_Matkul(String kd, String mk, String dsn, int jmlsks){ 
        this.kode_mk = mk;
        this.nama_mk = kd;
        this.dosen_pengampu = dsn;
        this.jml_sks = jmlsks;
    }

}
