package ProjectFull;

import ProjectFull.Keterangan;

public class akun extends infoData implements Keterangan{    
    //atribut
    private String pass,email;
    private int noHp;
    public String gender,domisili,sekolah;
    
    //method
    public void setPass(String Password){
        this.pass = Password;
    }
    public String getPass(){
        return pass;
    }
    public void setEmail(String Email){
        this.email = Email;
    }
    public String getEmail(){
        return email;
    }
    public void setNoHP(int Nomor){
        this.noHp = Nomor;
    }
    public int getNoHP(){
        return noHp;
    }
    public void gender(String Gender){
        this.gender = Gender;
    }
    public String cetakGender(){
        return gender;
    }
    public String cetakDomisili(){
        return domisili;
    }
    public String cetakSekolah(){
        return sekolah;
    }
    public double Diskon(){
        double diskon;
        return  diskon = cetakHarga() - harga * 0.3;
    }
    @Override
    public String Ket(){
        String ket;
        if(getcetakUsername().equals("Vigain")){
            ket = "Usser Sudah Ada";
        }else{
            ket = "Usser Tersedia";
        }
        return ket;
    }
}
