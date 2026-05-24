class NaturalNumber {
    private int number;
    
    NaturalNumber(int number) {
        if (number < 1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;    
    }

    Classification getClassification() {
        int sumaAlicuota = obtenerSumaAlicuota();
        if (sumaAlicuota == number){
            return Classification.PERFECT;
        }else if(sumaAlicuota > number){
            return Classification.ABUNDANT;
        }else{
            return Classification.DEFICIENT;
        }
    }

    private int obtenerSumaAlicuota(){
        int suma = 1;
        if (number == 1){
            return 0;
        }
        for(int i = 2; i <= (int)Math.sqrt(number); i ++){
            if(number % i == 0){
                suma += i;
                int factor = number / i;
                if(i != factor){
                    suma += factor;
                }
            }
        }

        return suma;
    }
}
