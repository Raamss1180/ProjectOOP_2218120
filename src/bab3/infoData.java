package bab3;
public class infoData {
    //atribut
    private String murid;
    private double uji1, uji2,nilai;
    public String id,pengajar,materi,jam,mapel;
    public int harga;
    
    //method
    public void setUsername(String Username){
        this.murid = Username;
    }
    public String getcetakUsername(){
        return murid;
    } 
    public String cetakId(){
        return id;
    }
    public String cetakPengajar(){
        return pengajar;
    }
    public String cetakMapel(){
        return mapel;
    }
    public String cetakMateri(){
        return materi;
    }
    public int cetakHarga(){
        return harga;
    }
    public String cetakJam(){
        return jam;
    }
    //overloading
    public double cetakUji(){
        return uji1; 
    }
    public double cetakUji(int a){
        return uji2; 
    }
    //overLoading
    public double cetakNilai(){
        return nilai; 
    }
    //method nilai hasil belajar
    public double cetakNilai(int a, int b){
        nilai = (uji1*0.5) + (uji2*0.5);
        return nilai;
    }
}