/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Grupo 6
 */
public class ListIterator<E> implements Iterator<E>{

    private List<E> source = null;
    private int index = 0;

    public ListIterator(List<E> source){
        this.source = source;
    }

    public ListIterator() {
        this.source = new java.util.ArrayList<E>();
    }

    @Override
    public boolean hasNext() {
        return this.index < this.source.size();
    }

    @Override
    public E next() {
        return this.source.get(this.index++);
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("No soportado.");
    }

    @Override
    public String toString() {
        String salida="ListIterator: ";
        for(int i = 0; i<source.size(); i++){
            if(i==source.size()-1){
                  salida+=source.get(i);
            }else{
                  salida+=source.get(i)+", ";
            }
        }
        return salida;
    }

   
}
