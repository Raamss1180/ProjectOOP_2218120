/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme;

/**
 *
 * @author Naufal whildan
 */
public class Apel extends Buah {
    public Apel(){
        this.nama ="Apel";
    }
    
    void makanBuah(){
        System.out.println(nama+"dimakan dengan di kupas kulitnya atau dimakan langsung(digigit).");
    }
}
