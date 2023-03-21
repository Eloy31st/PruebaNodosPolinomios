public class Polinomio{
    private Nodo termino_mayor;
    private int grado = 0;

    public Polinomio (){
        termino_mayor = null;
        grado = -1;
    }

    public void cargarElemento(Polinomio polinomio, int termino, int valor){
        Nodo aux = new Nodo();
        datoPolinomio dato = new datoPolinomio(termino, valor);
        aux.setDato(dato);
        if(termino > polinomio.getGrado()){
            aux.setSiguiente(polinomio.getTermino_mayor());
            polinomio.setTermino_mayor(aux);
            polinomio.setGrado(termino);
        }else{
            Nodo aux2 = polinomio.getTermino_mayor();
            while(aux2.getSiguiente() != null && aux2.getSiguiente().getDato().getTermino() > termino){
                aux2 = aux2.getSiguiente();
            }
            aux.setSiguiente(aux2.getSiguiente());
            aux2.setSiguiente(aux);
        }
    }

    public void modificarElemento(Polinomio polinomio, int termino, int valor){
        Nodo aux = polinomio.getTermino_mayor();
        while(aux != null && aux.getDato().getTermino() != termino){
            aux = aux.getSiguiente();
        }
        if(aux != null){
            aux.getDato().setValor(valor);
        }
    }

    public float obtenerValor(Polinomio polinomio, int termino){
        Nodo aux = polinomio.getTermino_mayor();
        while(aux != null && aux.getDato().getTermino() > termino){
            aux = aux.getSiguiente();
        }
        if(aux != null && aux.getDato().getTermino() == termino){
            return aux.getDato().getValor();
        }else{
            return 0;
        }
    }

    public String mostrar(Polinomio polinomio){
        String polinomioString = "";
        Nodo aux = polinomio.getTermino_mayor();
        if(aux != null) {
            while (aux != null) {
                String signo = "";
                if (aux.getDato().getValor() >= 0) {
                    signo = "+";
                }
                polinomioString += signo + aux.getDato().toString();
                aux = aux.getSiguiente();
            }
        }
        return polinomioString;
    }

    public Polinomio sumar(Polinomio polinomio1, Polinomio polinomio2){
        Polinomio polinomioResultado = new Polinomio();
        Nodo aux1 = polinomio1.getTermino_mayor();
        Nodo aux2 = polinomio2.getTermino_mayor();
        while(aux1 != null && aux2 != null){
            if(aux1.getDato().getTermino() == aux2.getDato().getTermino()){
                cargarElemento(polinomioResultado, aux1.getDato().getTermino(), aux1.getDato().getValor() + aux2.getDato().getValor());
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();
            }else if(aux1.getDato().getTermino() > aux2.getDato().getTermino()){
                cargarElemento(polinomioResultado, aux1.getDato().getTermino(), aux1.getDato().getValor());
                aux1 = aux1.getSiguiente();
            }else{
                cargarElemento(polinomioResultado, aux2.getDato().getTermino(), aux2.getDato().getValor());
                aux2 = aux2.getSiguiente();
            }
        }
        while(aux1 != null){
            cargarElemento(polinomioResultado, aux1.getDato().getTermino(), aux1.getDato().getValor());
            aux1 = aux1.getSiguiente();
        }
        while(aux2 != null){
            cargarElemento(polinomioResultado, aux2.getDato().getTermino(), aux2.getDato().getValor());
            aux2 = aux2.getSiguiente();
        }
        return polinomioResultado;
    }

    public Polinomio multiplicar(Polinomio polinomio1, Polinomio polinomio2){
        Polinomio polinomioResultado = new Polinomio();
        Nodo aux1 = polinomio1.getTermino_mayor();
        Nodo aux2 = polinomio2.getTermino_mayor();
        while(aux1 != null){
            while(aux2 != null){
                cargarElemento(polinomioResultado, aux1.getDato().getTermino() + aux2.getDato().getTermino(), aux1.getDato().getValor() * aux2.getDato().getValor());
                aux2 = aux2.getSiguiente();
            }
            aux1 = aux1.getSiguiente();
            aux2 = polinomio2.getTermino_mayor();
        }
        return polinomioResultado;
    }

    public void eliminarElemento(Polinomio polinomio, int termino){
        Nodo aux = polinomio.getTermino_mayor();
        if(aux != null){
            if(aux.getDato().getTermino() == termino){
                polinomio.setTermino_mayor(aux.getSiguiente());
            }else{
                while(aux.getSiguiente() != null && aux.getSiguiente().getDato().getTermino() != termino){
                    aux = aux.getSiguiente();
                }
                if(aux.getSiguiente() != null){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }
            }
        }
    }

    public boolean comprobarElemento(Polinomio polinomio, int termino){
        Nodo aux = polinomio.getTermino_mayor();
        while(aux != null && aux.getDato().getTermino() != termino){
            aux = aux.getSiguiente();
        }
        if(aux != null){
            return true;
        }else{
            return false;
        }
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
}