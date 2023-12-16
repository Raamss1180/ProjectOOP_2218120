package bab1;
public class infoData {
    //atribut
    String  Murid,Id,Pengajar,Materi,Jam,Mapel;
    int  Harga;
    double Uji1,Uji2,Nilai;
    
    //konstruktor
    public infoData(){
        if(Murid == "Rama"){
            this.Uji1 = 90;
            this.Uji2 = 95;
        }else if(Murid == "Vio"){
            this.Uji1 = 98;
            this.Uji2 = 100;
        }else{
            this.Uji1 = 80;
            this.Uji2 = 92;
        }
    }
    
    //method nonvoid
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
