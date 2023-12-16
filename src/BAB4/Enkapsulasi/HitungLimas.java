/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author Naufal whildan
 */
public class HitungLimas {
  private double LuasAlas;
  public double Tinggi;
  double  volume;
  
  public void setLuasAlas(double LuasAlas){
      this.LuasAlas = LuasAlas;
  }
  public double getLuasAlas(){
    return LuasAlas;
  }
  double volumeLimas(){
      volume = (1.0/3.0)*LuasAlas*Tinggi;
      return volume;
  }
}
