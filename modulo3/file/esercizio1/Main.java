package modulo3.file.esercizio1;

import modulo3.file.esercizio1.classi.Banca;

/*
 * Esercizio 3.1 – BankAccount Testo:
    Scrivere un programma che costruisca un conto bancario chiamato harrysChecking, versi in esso
    $1000, prelevi da esso $500, prelevi altri $400 e infine visualizzi il saldo rimanente.
    Il programma deve poi creare un altro conto bancario chiamato momsSaving, utilizzando il
    costruttore che inizializza la variabile balance.
    Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito del quale viene
    stampato il saldo.
 */

public class Main {
    public static void main(String[] args) {
        
        Banca harrysChecking = new Banca("harrysChecking",0,0);

        harrysChecking.versa(1000);
        harrysChecking.ritira(500);
        harrysChecking.ritira(400);
        harrysChecking.saldo();

        Banca momsSaving = new Banca("momsSaving", 1000, 10);
        momsSaving.saldo();
    }
}
