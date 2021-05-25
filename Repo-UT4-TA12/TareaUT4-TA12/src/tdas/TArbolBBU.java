package tdas;

import tdas.IArbolBBU;
import tdas.Lista;
import tdas.TArbolBB;
import universidad.Alumno;
import universidad.Carrera;

public class TArbolBBU extends TArbolBB<Alumno> implements IArbolBBU {
    @Override
    public void armarIndicesCarreras(Lista<Carrera> carreras) {
        if (this.getRaiz() != null){
            this.getRaiz().indizar(carreras);
        }
    }
}
