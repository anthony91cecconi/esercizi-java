package modulo5.esercizio8;

import java.util.Scanner;

import modulo5.esercizio8.classi.Banca;

/*
    Esercizio 5.8 - BankWithPassword Testo:
Lo scopo del programma è riadattare il programma dell’esercizio 3.1, introducendo il metodo
public boolean controlPassword(int pass), che restituisce true se la password inserita è corretta,
false altrimenti. Questo metodo deve essere utilizzato all’interno di altri metodi per verificare che
la password sia corretta e dare il consenso per procedere alle operazioni di deposit, whithdraw e
addInterest (presenti nell’esercizio BanckAccount 3.1)
*/

public class Main{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Banca harrysChecking = new Banca("harrysChecking",0,0, 123);

        if (controlloPassword(harrysChecking)) {
            System.out.println("password corretta ");
            harrysChecking.versa(1000);
            harrysChecking.ritira(500);
            harrysChecking.ritira(400);
            harrysChecking.saldo();
        }

       
        

        Banca momsSaving = new Banca("momsSaving", 1000, 10,123);

        if (controlloPassword(momsSaving)) {
            momsSaving.saldo();
        }
        
    }
    
    public static boolean controlloPassword(Banca banca){
        System.out.println("inserire password per " + banca.getNomeConto() );
        return banca.controlPassword(controlloNumero());
    }

    public static int controlloNumero(){
        try {
            return scan.nextInt();
        } catch (Exception e) {
           System.out.println("cè stato un errore, prova ad inserire un altra pasword!");
           return controlloNumero();
        }
    }
}