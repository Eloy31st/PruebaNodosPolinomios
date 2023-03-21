public class datoPolinomio{
     private int termino;
     private float valor;

     public datoPolinomio(int termino, float valor) {
            this.termino = termino;
            this.valor = valor;
     }

     public int getTermino() {
         return termino;
     }

     public void setTermino(int termino) {
         this.termino = termino;
     }

     public float getValor() {
         return valor;
     }

     public void setValor(float valor) {
         this.valor = valor;
     }

     public String toString(){
            return "Polinomio: " + termino + "*x^" + valor;
     }
}
