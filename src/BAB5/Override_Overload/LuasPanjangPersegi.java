/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB5.Override_Overload;

/**
 *
 * @author Naufal whildan
 */
public class LuasPanjangPersegi extends BangunDatar{
    int panjang;
    int lebar;

    @Override
    public double Luas() {
        return super.Luas(panjang,lebar);
    }

    

    
}
