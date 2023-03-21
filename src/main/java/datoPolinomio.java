public class datoPolinomio{
     private int termino;
     private int valor;

     public datoPolinomio(int termino, int valor) {
            this.termino = termino;
            this.valor = valor;
     }

     public int getTermino() {
         return termino;
     }

     public void setTermino(int termino) {
         this.termino = termino;
     }

     public int getValor() {
         return valor;
     }

     public void setValor(int valor) {
         this.valor = valor;
     }

     public String toString(){
            return termino + "x^" + valor;
     }
}
