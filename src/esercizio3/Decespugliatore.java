/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author Irene
 */
public class Decespugliatore extends Apparecchio {

    private boolean accElettrica;

    public Decespugliatore(boolean accElettrica, int id, int tot, String marca) {
        super(id, tot, marca);
        this.accElettrica = accElettrica;
    }

    public boolean isAccElettrica() {
        return accElettrica;
    }

    

    @Override
    public String toString() {
        String s = super.toString() + " acc.el:" + accElettrica;
        return s;
    }

    }
