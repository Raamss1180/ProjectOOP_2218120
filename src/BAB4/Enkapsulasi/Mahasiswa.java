/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

import BAB1.ClassObject.*;

/**
 *
 * @author Naufal whildan
 */
public class Mahasiswa {
    String nim, nama, prodi, angktn,jeniskelamin,alamat;
    void dataNIM(String Nim){
        this.nim = Nim;
    }    
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataProdi(String Prodi){
        this.prodi = Prodi;
    }
    void dataAngkatan(String Angktn){
        this.angktn = Angktn;
    }
     void dataJenisKelamin(String JenisKelamin){
        this.jeniskelamin = JenisKelamin;
    }
    void dataAlamat(String Alamat){
        this.alamat = Alamat;
    }    
     
    String cetakNIM(){
        return nim;
    }
    String cetakNama(){
        return nama;
    }
    String cetakProdi(){
        return prodi;
    }
    String cetakAngkatan(){
        return angktn;
    }
    String cetakJenisKelamin(){
        return jeniskelamin;
    }
    String cetakAlamat(){
        return alamat;
    }
}
