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