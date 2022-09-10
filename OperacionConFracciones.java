
class OperacionConFracciones{

    public static void main(String args[]){

        Fraccion a = new Fraccion(10,5);
        Fraccion b = new Fraccion(3,7);


        Fraccion c = Fraccion.suma(a,b);
        imprimirFraccion(c);

    }

    private static void imprimirFraccion(Fraccion a){
        System.out.println(a.numerador + "/" + a.denominador);
    }

    
}
