

class EjercicioUno{
    public static void main(String args[]){

        //1.1 Check the initial conditions
        int arrayLength = args.length;

        //1.1.1 Check there is at least two elements, method and order
        if (arrayLength > 3){

            char order = args[arrayLength - 1].charAt(0); //Last element
            char method = args[arrayLength - 2].charAt(0);

            Sort Ordena = new Sort();

            switch(method){
                case 'B':
                case 'b':
                    Ordena.bubble(args, order, 0, 2);
                break;

                case 'I':
                case 'i':
                    Ordena.insertion(args, order, 0, 2);
                break;
                case 'S':
                case 's':
                    Ordena.selection(args, order, 0, 2);
                break;
            }
            System.out.println("Elementos ordenados:");
            printArray(args, 0, 2);
        }else{
            System.out.println("There must be at least two sentences, method and order\n");
        }        
    }

    private static void printArray(String strings[]){
        for (int i = 0; i < strings.length; i++)
            System.out.println(strings[i]);
    }

    //Function overloading printArray
    private static void printArray(String strings[], int ignoreLeft, int ignoreRight){
        for (int i = (0 + ignoreLeft); i < (strings.length - ignoreRight); i++)
            System.out.println(strings[i]);
    }


}
