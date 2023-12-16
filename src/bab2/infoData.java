package bab2;
public class infoData {
    //atribut
    String  Murid,Id,Pengajar,Materi,Jam,Mapel;
    int  Harga;
    double Uji1,Uji2,Nilai;
    
    //konstruktor
    public infoData(){
        this.Uji1 = 85;
        this.Uji2 = 90;
    }
    //void method
    void dataMurid(String Nama_Mrd){
 this.Murid = Nama_Mrd;
    }
    void dataId(String Id_Mrd){
 this.Id = Id_Mrd;
    }
    void dataPengajar(String Pengajar){
 this.Pengajar = Pengajar;
    }
    void dataMapel(String Mapel){
 this.Mapel = Mapel;
    }
    void dataMateri(String Materi){
 this.Materi = Materi;
    }
    void dataHarga(int harga){
 this.Harga = harga;
    }
    void dataJam(String Jam){
 this.Jam = Jam;
    }
    void dataUji1(double NilaiUji1){
 this.Uji1 = NilaiUji1;
    }
    void dataUji2(double NilaiUji2){
 this.Uji2 = NilaiUji2;
    }
    void dataNilai(double Nilai){
 this.Nilai = Nilai;
    }
    String cetakMurid(){
return Murid;
    }
    String cetakId(){
 return Id;
 }
    String cetakPengajar(){
 return Pengajar;
 }
    String cetakMapel(){
 return Mapel;
 }
    String cetakMateri(){
 return Materi;
 }
    int cetakHarga(){
 return Harga;
 }
    String cetakJam(){
 return Jam;
 }
    double cetakUji1(){
 return Uji1; 
 }
    double cetakUji2(){
 return Uji2; 
 }
    double cetakNilai(){
 return Nilai; 
 }
    //method nilai hasil belajar
    double NilaiBljr(){
        Nilai = (Uji1*0.5) + (Uji2*0.5);
        return Nilai;
    }
}

