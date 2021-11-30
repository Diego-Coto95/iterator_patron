/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;

import java.util.Iterator;

/**
 *
 * @author Grupo 6
 */
public interface Iterable<T> {

    /**
     * Returns an iterator over a set of elements of type T.
     * 
     * @return an Iterator.
     */
    //Iterator<T> ListaIterator();
    public boolean hasNext();
    public GenericObject next();
    public void remove(GenericObject object);
}