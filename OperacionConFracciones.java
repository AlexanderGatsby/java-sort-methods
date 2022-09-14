
import java.util.Scanner;

class OperacionConFracciones{

    public static void main(String args[]){

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digita la opción a realizar");
            System.out.println("1: Sumar fracciones");
            System.out.println("2: Restar fracciones");
            System.out.println("3: Multiplicación de fracciones");
            System.out.println("4: División de fracciones");

            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    imprimirFraccion(Fraccion.suma(leerFraccion(), leerFraccion()));
                break;
                case 2:
                    imprimirFraccion(Fraccion.resta(leerFraccion(), leerFraccion()));
                break;
                case 3:
                    imprimirFraccion(Fraccion.multiplicacion(leerFraccion(), leerFraccion()));
                break;
                case 4:
                    imprimirFraccion(Fraccion.division(leerFraccion(), leerFraccion()));
                break;
            }


        }while (opcion != 0);

    }

    private static void imprimirFraccion(Fraccion a){
        System.out.println("\nResultado: ");
        if (a.numerador == 0)
            System.out.println("0\n"); //Resultado de fracción es 0/n, simplificar a 0
        else if (a.numerador % a.denominador == 0)
            System.out.println(a.numerador/a.denominador + "\n");//Resultado es un entero.
        else 
            System.out.println(a.numerador + "/" + a.denominador + "\n");//Fracción a/b
    }

    private static Fraccion leerFraccion(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numerador de la fracción");
        int numerador = scanner.nextInt();
        System.out.println("Digite el denominador de la fracción");
        int denominador = scanner.nextInt();

        while (denominador == 0){
            System.out.println("El denominador no puede ser cero");
            denominador = scanner.nextInt();
        }

        return new Fraccion(numerador, denominador);

    }

    
}
