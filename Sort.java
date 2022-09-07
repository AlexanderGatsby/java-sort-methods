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

    void selection(String[] strings, char order) {
        for (int i = 0; i < (strings.length - 1); i++) {
            for (int j = (i + 1); j < strings.length; j++) {
                if (compareStrings(strings[i], strings[j]) == order) {
                    String aux = strings[i];
                    strings[i] = strings[j];
                    strings[j] = aux;
                }
            }
        }
    }

    void insertion(String strings[], char order) {
        for (int j = 1; j < strings.length; j++) {
            String aux = strings[j];
            int i = j-1;
            while ((i > -1) && (compareStrings(strings[i], aux) == order)) {
                strings[i+1] = strings[i];
                i--;
            }
            strings[i+1] = aux;
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
            return 'B';
        
        return 'N';
    }

}