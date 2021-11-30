/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;

import java.util.List;

/**
 *
 * @author Grupo 6
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<GenericObject> array = new ArrayList<GenericObject>();
        GenericObject<String> ob1 = new GenericObject<String>();
        ob1.setObject("prueba1");
        GenericObject<Integer> ob2 = new GenericObject<Integer>();
        ob2.setObject(5);
        GenericObject<Integer> ob3 = new GenericObject<Integer>();
        ob3.setObject(15);
        array.setObjetos(new GenericObject[]{ob1, ob2, ob3});
        
         while (array.hasNext()) {
            String element = ""+array.next();
            System.out.println(element.toString());
        }
         
        array.remove(ob2);
        
        System.out.println("--------------");
//        System.out.println(array.hasNext());

        while (array.hasNext()) {
            String element = ""+array.next();
            System.out.println(element.toString());
        }
        System.out.println("---------iterator-----");
//        ListIterator l = new ListIterator((List) array.iterator());
        System.out.println(array.iterator());
//        while (array.iterator().hasNext()) {
//            String element = ""+array.iterator().next();
//            System.out.println(element.toString());
//        }
        
        
//        array.
//        array = ( E[])new GenericObject[]
        //Object[] result2 = new GenericObject[3];
        //Object ob1 = new GenericObject("s");
        //array.objetos = re;
    }

}
