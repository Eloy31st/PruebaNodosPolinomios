public interface Nodo {
    datoPolinomio dato = null;
    Nodo siguiente = null;

    public datoPolinomio getDato();

    public void setDato(datoPolinomio dato);

    public Nodo getSiguiente();

    public void setSiguiente(Nodo siguiente);

}
