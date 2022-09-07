

class EjercicioUno{
    public static void main(String args[]){

        //1.1 Check the initial conditions
        int arrayLength = args.length;

        //1.1.1 Check there is at least one element, method and order
        if (arrayLength > 3){

            char order, method;

            order = args[arrayLength - 1].charAt(0); //Last element
            method = args[arrayLength - 2].charAt(0);

            Sort Ordena = new Sort();

            Ordena.insertion(args, order);
            printArray(args);

            


        }else{
            System.out.println("There must be at least one sentence, method and order");
        }        
    }

    private static void printArray(String strings[]){
        for (int i = 0; i < strings.length; i++)
            System.out.println(strings[i]);
    }

}
