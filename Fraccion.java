public class Fraccion{

    int numerador;
    int denominador;

    public Fraccion(int numera, int denomi){
        numerador = numera;
        denominador = denomi;
    }

    //Suma de fracciones:
    // a   c   (a)(d) + (b)(c)
    // - + - = ---------------
    // b   d       (b)(d)
    public static Fraccion suma (Fraccion a, Fraccion b){
        return simplificación((a.numerador*b.denominador + a.denominador*b.numerador), (a.denominador * b.denominador));
    }


    //Resta de fracciones:
    // a   c   (a)(d) - (b)(c)
    // - - - = ---------------
    // b   d       (b)(d)
    public static Fraccion resta (Fraccion a, Fraccion b){
        return simplificación((a.numerador*b.denominador - a.denominador*b.numerador), (a.denominador * b.denominador));
    }


    //Multiplicación de fracciones:
    // a   c   (a)(c)
    // - * - = ------
    // b   d   (b)(d)
    public static Fraccion multiplicacion (Fraccion a, Fraccion b){
        return simplificación((a.numerador*b.numerador), (a.denominador * b.denominador));
    }


    //División de fracciones:
    // a   c   (a)(d)
    // - / - = ------
    // b   d   (b)(c)
    public static Fraccion division (Fraccion a, Fraccion b){
        return simplificación((a.numerador*b.denominador), (a.denominador * b.numerador));
    }

    //Simplificación de fracciones:
    // a   c(k)   c
    // - = ---- = -
    // b   d(k)   d
    // {donde k es el máximo común divisor}

    public static Fraccion simplificación(int numerador, int denominador){
        
        int mcd = maximoComunDivisor(numerador, denominador);

        return new Fraccion((numerador/mcd), (denominador/mcd));
    }

    public static int maximoComunDivisor(int a, int b){

        int MCD = 1;

        //Evaluar cuál cantidad es la menor, para trabajar sobre ella y ahorrar iteraciones
        if (a < b){
            //Buscar todos los divisores de a
            for (int i = 2; i <= (a/2); i++){
                // Si el módulo de la divisón es cero, sí es divisor de a
                if (a%i == 0 && b%i == 0){
                    MCD = i;
                }
            }
        }else {
            //Buscar todos los divisores de b
            for (int i = 2; i <= (b/2); i++){
                // Si el módulo de la divisón es cero, sí es divisor de b
                if (b%i == 0 && a%i == 0){
                    MCD = i;
                }
            }
        }
        return MCD;
    }

}