package ProjectFull;

import ProjectFull.Waktu;

public class paket extends infoData implements Waktu{
    //atribut
    protected String paket, jurusan;
    public int kelas;
    
    //method void menyimpan nilai
    public void setPaket(String paket){
        this.paket = paket;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setKelas(int kelas){
        this.kelas = kelas;
    }
    
    //method nonvoid mengambil nilai
    public String paketBimbel(){
        return paket;//variable pilihan paket pada combobox 
    } 
    public String Jurusan(){
        return jurusan;//variable pilihan Jurusan pada combobox
    }
    public int Kelas(){
        return kelas;//variable pilihan Kelas pada combobox
    }
    //overreading
    @Override
    public int cetakHarga(){
        return harga+(25000);//variable harga di tambah harga jasa pengajar 
    }
    //abstract method
    @Override
    public double Diskon(){
        double diskon;
        if(Kelas() >= 12){
            diskon = cetakHarga() - harga * 0.3;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    @Override
    public String LamaKursus(){
        String ket = null;
        if(paketBimbel().equals("Persiapan UTBK")){
            if(Kelas() == 10){
                ket = "2 Setengah thn";
            }else if(Kelas() == 11){
                ket = "1 Setengah thn";
            }else{
                ket = "6 - 8 Bln";
            }
        }else if(paketBimbel().equals("Pendalaman Materi")){
            ket = "Harian";
        }else if(paketBimbel().equals("Mengerjakan PR")){
            ket = "Permintaan Murid";
        }
        return ket;
    }
}