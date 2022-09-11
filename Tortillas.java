
class Tortillas{

    public static void main(String[] args) throws Exception{

        Stack stack = new Stack();

        
        stack.push(new Fraccion(10, 2));
        stack.push(new Fraccion(4, 3));
        stack.push(new Fraccion(25, 8));
        stack.push(new Fraccion(19, 9));
        stack.push(new Fraccion(43, 2));
        stack.push(new Fraccion(16, 7));
        

        for (int i = 0; i < stack.size; i++){
            imprimirFraccion((Fraccion) stack.getItemAt(i));
        }

        //Pop the last element and print it
        Fraccion lastElement = (Fraccion) stack.pop();
        imprimirFraccion(lastElement);

        
        for (int i = 0; i < stack.size; i++){
            imprimirFraccion((Fraccion) stack.getItemAt(i));
        }
        

    }


    private static void imprimirFraccion(Fraccion a){
        if (a != null)
            System.out.println(a.numerador + "/" + a.denominador);
    }

}