class Sort{

    void bubble(String strings[], char order){
        for (int i = 0; i < (strings.length - 1); i++) {
            for (int j = 0; j < (strings.length - i - 1); j++) {

                if (compareStrings(strings[j + 1], strings[j]) == order){
                    String aux = strings[j + 1];
                    strings[j + 1] = strings[j];
                    strings[j] = aux;
                }
            }
        }
    }


    //Bubble function overloading
    void bubble(String strings[], char order, int ignoreLeft, int ignoreRight){
        for (int i = (0 + ignoreLeft); i < (strings.length - 1 - ignoreRight); i++) {
            for (int j = (0 + ignoreLeft); j < (strings.length - i - 1 - ignoreRight); j++) {

                if (compareStrings(strings[j + 1], strings[j]) == order){
                    String aux = strings[j + 1];
                    strings[j + 1] = strings[j];
                    strings[j] = aux;
                }
            }
        }
    }


    void selection(String[] strings, char order) {
        for (int i = 0; i < strings.length; i++) {

            int limit = i;

            for (int j = (i + 1); j < strings.length; j++) {
                if (compareStrings(strings[j], strings[limit]) == order) {
                    limit = j;
                }
            }
            String aux = strings[i];
            strings[i] = strings[limit];
            strings[limit] = aux;
        }
    }

    //Selection function overloading
    void selection(String[] strings, char order, int ignoreLeft, int ignoreRight) {
        for (int i = (0 + ignoreLeft); i < (strings.length - ignoreRight); i++) {

            int limit = i;

            for (int j = (i + 1); j < (strings.length - ignoreRight); j++) {
                if (compareStrings(strings[j], strings[limit]) == order) {
                    limit = j;
                }
            }
            String aux = strings[i];
            strings[i] = strings[limit];
            strings[limit] = aux;
        }
    }

    void insertion(String strings[], char order) {
        for (int i = 1; i < strings.length; i++) {
            String aux = strings[i];
            int j = i-1;
            while ((j > -1) && (compareStrings(aux, strings[j]) == order)) {
                strings[j+1] = strings[j];
                j--;
            }
            strings[j+1] = aux;
        }
    }

    //Insertion function overloading
    void insertion(String strings[], char order, int ignoreLeft, int ignoreRight) {
        for (int i = (1 + ignoreLeft); i < (strings.length - ignoreRight); i++) {
            String aux = strings[i];
            int j = i-1;
            while ((j > (-1 + ignoreLeft)) && (compareStrings(aux, strings[j]) == order)) {
                strings[j+1] = strings[j];
                j--;
            }
            strings[j+1] = aux;
        }
    }


    char compareStrings(String a, String b){
        for (int i = 0; i < a.length() && i < b.length(); i++){
            if (a.charAt(i) < b.charAt(i))
                return 'A';
            else if (a.charAt(i) > b.charAt(i))
                return 'D';
        }

        if (a.length() < b.length())
            return 'A';
        else if (a.length() > b.length())
            return 'D';
        
        return 'N';
    }

}