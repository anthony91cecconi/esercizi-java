package modulo5.esercizio4.classi;


public class Grade {

    public Grade(){
    }

    public double convert(String voto){

        String[] voti =  voto.split("");

        double risultato = 0;

        if (voti[1] != null) {
            if (voti[1].equals("+")) {
                risultato +=  0.3;
            }else{
                risultato -=  +0.3;
            }
        }

        if(voti[0].toUpperCase().equals("A") ){
            risultato += 4;
        }

        if(voti[0].toUpperCase().equals("B")){
            risultato += 3;
        }

        if(voti[0].toUpperCase().equals("C")){
            risultato += 2;
        }

        if(voti[0].toUpperCase().equals("D")){
            risultato += 1;
        }

        return risultato > 4? 4.0:risultato;

    }
}
