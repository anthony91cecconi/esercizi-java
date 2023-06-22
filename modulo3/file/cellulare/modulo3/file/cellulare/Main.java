package modulo3.file.cellulare;

import java.util.Scanner;

import modulo3.file.cellulare.classi.Cellulare;


/*
 * Esercizio 3.2 – Cellulare Testo:
    Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare con contratto a
    ricarica.
    Tale classe prevede due variabili d'istanza. La prima variabile d'istanza e' definita come private
    double carica, e rappresenta il quantitativo di euro disponibile per le chiamate. La seconda
    variabile d'istanza e' definita come private int numeroChiamate, e rappresenta il numero di
    chiamate effettuate con il cellulare. La classe deve implementare un costruttore public
    Cellulare(double unaCarica), che prende come parametro esplicito la quantita' di euro della
    ricarica iniziale. La classe deve inoltre implementare i seguenti metodi. Un metodo definito come
    public void ricarica(double unaRicarica), che ricarica il telefonino. Un metodo definito come public
    void chiama(double minutiDurata), che effettua una chiamata di durata in minuti specificata dal
    parametro esplicito. Tale metodo dovra' aggiornare la carica disponibile, ed incrementare la
    memoria contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo di 0.20
    euro per ogni minuto di chiamata. Un metodo public double numero404(), che restituisce il valore
    della carica disponibile. Un metodo public int getNumeroChiamate(), che restituisce il valore della
    variabile d'istanza numeroChiamate. Infine, un metodo public void azzeraChiamate(), che azzera la
    variabile contenente il numero di chiamate effettuate dal telefonino.
 */

public class Main {
    public static void main(String[] args) {
        Cellulare cellulare = new Cellulare(0);
        Scanner scan = new Scanner(System.in);
        menu(cellulare,scan);
        cellulare.ricarica(10);
        cellulare.chiama(100);
        cellulare.getNumeroChiamate();

        System.out.println(cellulare.numero404());
        
        scan.close();
    }

    static int controlInt(Scanner scan){
        if(scan.hasNextInt()){
            return scan.nextInt();
        }else{
            System.out.println("valore inserito non corretto, inserire nuovamente");
            return controlInt(scan);
        }
    }

    static double controlDouble(Scanner scan){
        if(scan.hasNextDouble()){
            return scan.nextDouble();
        }else{
            System.out.println("valore inserito non corretto, inserire nuovamente");
            return controlDouble(scan);
        }
    }

    static void menu(Cellulare cellulare,Scanner scan){
        System.out.println("menu \n"+
                            "1. ricarica \n"+
                            "2. chiama \n"+
                            "3. guarda numero chiamate \n"+
                            "4. azzera chiamate\n"+
                            "5. guarda credito");
                            
        System.out.println("seleziona ora ");
        switch (controlInt(scan)) {
            case 1:
                ricarica(cellulare,scan);
                break;
            case 2:
                chiama(cellulare,scan);
                break;
            case 3:
                chiamate(cellulare,scan);
                break;
            case 4:
                azzeraChiamate(cellulare,scan);
                break;
            case 5:
                credito(cellulare,scan);
                break;
            default:
                System.out.println("numero non valido riprova");
                menu(cellulare, scan);
                break;
        }
    }

    static void ricarica(Cellulare cellulare,Scanner scan){
        System.out.println("inserire la ricarica");
        cellulare.ricarica(controlDouble(scan));
        menu(cellulare, scan);
    }
    
    static void chiama(Cellulare cellulare,Scanner scan){
        System.out.println("effettua chiamata per .. (minuti)");
        cellulare.chiama(controlDouble(scan));
        menu(cellulare, scan);
    }

    static void chiamate(Cellulare cellulare,Scanner scan){
        System.out.println("sono state effettuate " +cellulare.getNumeroChiamate()+ " chiamate");
        menu(cellulare, scan);
    }

    static void azzeraChiamate(Cellulare cellulare,Scanner scan){
        cellulare.azzeraChiamate();
        menu(cellulare, scan);
    }

    static void credito(Cellulare cellulare,Scanner scan){
        System.out.println("il credito residuo è " +cellulare.numero404());
        menu(cellulare, scan);
    }
}
