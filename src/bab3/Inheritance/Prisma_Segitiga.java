/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritance;

/**
 *
 * @author Naufal whildan
 */
public class Prisma_Segitiga extends Segitiga {
    double tinggiPrisma,vol;
    double volumePrisma(){
        vol =(Luas()*tinggiPrisma);
        return vol;
    }
}
