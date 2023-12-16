/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanBab6;

/**
 *
 * @author Naufal whildan
 */
public class Gaji_reward extends Gaji_abs_reward{
    int menit;
    double tunj_bonus;
    double gajipokok;
    double tunj_anak;
    double anak;
    int waktu;


    @Override
    public double tunjanganAnak() {
       if (anak == 1){
        tunj_anak = gajipokok*0.1;   
       }
       else if (anak >=2){
        tunj_anak = gajipokok*0.2;  
       }
       return tunj_anak;
    }
    
    
    @Override
    public double lembur() {
    waktu = (menit /60);
    tunj_bonus = waktu*25000;
    return tunj_bonus;
    }
    
    
}
