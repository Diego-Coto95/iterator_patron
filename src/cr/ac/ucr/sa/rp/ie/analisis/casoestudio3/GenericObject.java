/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;

/**
 *
 * @author Grupo 6
 */
public class GenericObject<E> {

    private E object;

    public GenericObject() {
    }

    public GenericObject(E object) {
        this.object = object;
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }

}
