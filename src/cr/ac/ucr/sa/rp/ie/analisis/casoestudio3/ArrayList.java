package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Grupo 6
 * @param <E>
 */
public class ArrayList<E> implements Iterable<E> {

    public GenericObject[] objetos;
    public int posicionarray;

    public ArrayList(GenericObject[] objetos) {
        this.objetos = objetos;
        this.posicionarray = 0;
    }

    public ArrayList() {

        this.posicionarray = 0;
    }

    public GenericObject[] getObjetos() {
        return objetos;
    }

    public void setObjetos(GenericObject[] objetos) {
        this.objetos = objetos;
    }

    @Override
    public boolean hasNext() {
        boolean result;
        if (this.posicionarray >= this.objetos.length) {
            this.posicionarray = 0;
        } else {
            if (posicionarray < objetos.length) {
                result = true;
            } else {
                result = false;
            }
            return result;
        }
        return false;
    }

    @Override
    public GenericObject next() {

        posicionarray++;

        return objetos[posicionarray - 1];
    }

    @Override
    public void remove(GenericObject object) {
//        throw new UnsupportedOperationException("No soportado.");
        GenericObject[] temp = new GenericObject[objetos.length - 1];
        for (int i = 0; i < objetos.length; i++) {
            if (!equals(object.getObject(), objetos[i].getObject())) {
                if (i > 0 && temp[i - 1] == null) {
                    temp[i - 1] = (objetos[i]);
                } else {
                    temp[i] = (objetos[i]);
                }

            }
        }

        if (temp != null) {
            this.objetos = new GenericObject[temp.length];

            for (int j = 0; j < temp.length; j++) {
                this.objetos[j] = (temp[j]);
            }
        }

    }

    public Iterator<E> iterator() {
        List l = new java.util.ArrayList();
        for (int i=0; i<objetos.length; i++){
            l.add(objetos[i].getObject());
        }
        Iterator it = (Iterator) new ListIterator(l);
//        it.add[i]= objetos[i];

        return it;
    }

    private String instanceOf(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return "integer";
        }
        if (a instanceof String && b instanceof String) {
            return "string";
        }
        return "desconocido";
    }

    public boolean equals(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "integer":
                int x = (int) a;
                int y = (int) b;
                return x == y;
            case "string":
                String ss1 = (String) a;
                String ss2 = (String) b;
                return ss1.equalsIgnoreCase(ss2);

        }
        return false;
    }
}
