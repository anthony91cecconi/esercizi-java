package modulo5.esercizio2;
/*
    * Esercizio 5.2 – Sort Testo:
    Scrivere un programma che riceva tre numeri in virgola mobile come dati in ingresso, per poi
    stamparli in ordine crescente.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        double[] numeri = new double[3];
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("inserire valore");
            numeri[i] = controlloNumeri(); 
        }

        Arrays.sort(numeri);

        for (double d : numeri) {
            System.out.println(d);
        }
    }

    public static double controlloNumeri() {
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        }else{
            scan.next();
            System.out.println("numero non valido riprovare");
            return controlloNumeri();
        }
    }

    
}
