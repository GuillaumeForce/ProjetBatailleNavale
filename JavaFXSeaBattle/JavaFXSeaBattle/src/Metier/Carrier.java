/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author guforce
 */
public class Carrier extends Boat {
    
    public Carrier(int size, Coordonnees pos, Alignment align) {
        super.setSize(size);
        super.setPos(pos);
        super.setAlignment(align);
        super.setHp(size);
    }
    

}
