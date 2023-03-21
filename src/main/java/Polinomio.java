public class Polinomio implements Nodo{
    private Nodo termino_mayor;
    private int grado = 0;

    public Polinomio (){
        termino_mayor = null;
        grado = -1;
    }



    public Nodo getTermino_mayor() {
        return termino_mayor;
    }

    public void setTermino_mayor(Nodo termino_mayor) {
        this.termino_mayor = termino_mayor;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public datoPolinomio getDato() {
        return null;
    }

    @Override
    public void setDato(datoPolinomio dato) {

    }

    @Override
    public Nodo getSiguiente() {
        return null;
    }

    @Override
    public void setSiguiente(Nodo siguiente) {

    }
}