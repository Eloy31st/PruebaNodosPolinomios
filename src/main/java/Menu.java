import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int termino, valor;
        Polinomio polinomio1 = new Polinomio();
        Polinomio polinomio2 = new Polinomio();
        do {
            System.out.println("Menu");
            System.out.println("1-Crear polinomio nº1");
            System.out.println("2-Crear polinomio nº2");
            System.out.println("3-Sumar polinomios");
            System.out.println("4-Mostrar polinomios");
            System.out.println("5-Multiplicar polinomios");
            System.out.println("6-Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el termino: ");
                    termino = sc.nextInt();
                    System.out.println("Ingrese el valor: ");
                    valor = sc.nextInt();
                    polinomio1.cargarElemento(polinomio1, termino, valor);
                    System.out.println("Polinomio 1: " + polinomio1.mostrar(polinomio1));
                    break;
                case 2:
                    System.out.println("Ingrese el termino: ");
                    termino = sc.nextInt();
                    System.out.println("Ingrese el valor: ");
                    valor = sc.nextInt();
                    polinomio2.cargarElemento(polinomio2, termino, valor);
                    System.out.println("Polinomio 2: " + polinomio2.mostrar(polinomio2));
                    break;
                case 3:
                    if(polinomio1 == null || polinomio2 == null){
                        System.out.println("No se han creado los polinomios");
                        break;
                    }else{
                        Polinomio suma = polinomio1.sumar(polinomio1, polinomio2);
                        System.out.println("Suma: " + suma.mostrar(suma));
                    }
                    break;
                case 4:
                    if(polinomio1 == null || polinomio2 == null){
                        System.out.println("No se han creado los polinomios");
                        break;
                    }else{
                        System.out.println("Polinomio 1: " + polinomio1.mostrar(polinomio1));
                        System.out.println("Polinomio 2: " + polinomio2.mostrar(polinomio2));
                    }
                    break;
                case 5:
                    if(polinomio1 == null || polinomio2 == null){
                        System.out.println("No se han creado los polinomios");
                        break;
                    }else{
                        Polinomio multiplicacion = polinomio1.multiplicar(polinomio1, polinomio2);
                        System.out.println("Multiplicacion: " + multiplicacion.mostrar(multiplicacion));
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        }while(opcion != 6);
    }
}
