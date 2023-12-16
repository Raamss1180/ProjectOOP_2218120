package ProjectFull;
public abstract class infoData {
    //abstract method
    public abstract double Diskon();
    
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
    public void setID(String id){
        this.id = id;
    }
    public String cetakPengajar(){
        return pengajar;
    }
    public void setPengajar(String peng){
        this.pengajar = peng;
    }
    public String cetakMapel(){
        return mapel;
    }
    public void setMapel(String mapel){
        this.mapel = mapel;
    }
    public String cetakMateri(){
        return materi;
    }
    public void setMateri(String materi){
        this.materi = materi;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int cetakHarga(){
        return harga;
    }
    public String cetakJam(){
        return jam;
    }
    public void setJam(String Jam){
        this.jam = Jam;
    }
    public double getUji1(){
        return uji1;
    }
    public void setUji1(double uji){
        this.uji1 = uji;
    }
    public double getUji2(){
        return uji2;
    }
    public void setUji2(double uji){
        this.uji2 = uji;
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
    public double cetakNilai(double a, double b){
        nilai = (uji1*0.5) + (uji2*0.5);
        return nilai;
    }
}
