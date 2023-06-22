package modulo5.esercizio9;

import java.util.Scanner;

import modulo5.esercizio9.classi.Car;
import modulo5.esercizio9.classi.DistributoreBenzina;


/*
      Esercizio 5.9 – CarFuel Testo:
    Modificare la classe Car2, assegnata nell’esercizio 3.4, in modo tale che la macchina riconosca il
    tipo di carburante che consuma(benzina o gasolio). Implementate inoltre i seguenti metodi: void
    aggiungiCarburante(double litri) che aggiunge carburante al serbatoio della macchina. void
    faiUnGiro(double kilometri) che simula una corsa di un'auto per un determinato numero di km.
    boolean usaBenzina() che restituisce se il carburante della macchina è benzina. boolean
    usaGasolio() che restituisce se il carburante della macchina è gasolio. double getSerbatoio()che
    restituisce il numero di litri di carburante rimanenti nel serbatoio. String getTipoDiCarburante()
    che restituisce il tipo di carburante della macchina...

    Esercizio 5.10 – DistributoreCarFuel
    Testo:
    Modificare la classe DistributoreBenzina, assegnata nell’esercizio 3.3, in modo che il distributore
    abbia due pompe, una di benzina ed una di gasolio. Ciascun tipo di carburante ha il suo costo per
    litro. Conseguentemente, dovrete raddoppiare il metodo rifornisci: dovrete avere un metodo per
    rifornire la benzina ed un metodo per rifornire il gasolio. Il metodo vendi deve essere modificato
    nel seguente modo: public void vendi(double euro, CarFuel unaAutomobile). Tale metodo
    rifornisce l'automobile specificata come parametro esplicito nel modo appropriato (benzina
    oppure gasolio). Nel Tester create varie automobili e distributori. Fate compiere alcuni "viaggi" alle
    automobili, e rifornitele di benzina in modo appropriato. Inoltre, rifornite le pompe di benzina in
    caso di necessita'.
  */
public class Main {
  static int controlInt(){
    if(scan.hasNextInt()){
        return scan.nextInt();
    }else{
        System.out.println("valore inserito non corretto, inserire nuovamente");
        return controlInt();
    }
  }

  static double controlDouble(){
      if(scan.hasNextDouble()){
          return scan.nextDouble();
      }else{
          System.out.println("valore inserito non corretto, inserire nuovamente");
          return controlDouble();
      }
  }
  public static final Scanner scan = new Scanner(System.in);
  public static Car auto;
  public static DistributoreBenzina benzinaio;


  public static void main(String[] args) {
    auto = new Car(10, "benzina");
    benzinaio = new DistributoreBenzina();

    menu();
  }

  static void menu(){
    System.out.println("menu \n"+
                        "1. guida \n"+
                        "2. rifornisci auto \n"+
                        "3. serbatoio auto \n"+
                        "4. rifornisci benzinaio\n"+
                        "5. aggiorna prezzo benzina");
                        
    System.out.println("seleziona ora ");
    switch (controlInt()) {
      case 1:
        guida();
        break;
      case 2:
        rifornimento();
        break;
      case 3:
        serbatoglioAuto();
        break;
      case 4:
        rifornimentoBenzinaio();
        break;
      case 5:
        aggiornaPrezzo();
        break;
      default:
          System.out.println("numero non valido riprova");
          menu();
          break;
    }
  }
    
  public static void guida(){
    System.out.println("per quanti km ?");
    auto.drive(controlDouble());
    menu();
  }

  public static void rifornimento(){
    System.out.println("quanti euro ? ");
    benzinaio.vendi(controlDouble(),auto);
    menu();
  }

  public static void rifornimentoBenzinaio(){
    System.out.println("cosa vuoi rifornire? \n 1-benzina \n 2-GPL \n altro- torna al menu");
    boolean tipo = true;

    switch (scan.nextLine()) {
      case "1":
        tipo = true;
        break;
      case "2":
        tipo = false;
        break;
    
      default:
        break;
    }

    System.out.println("litri ");
    benzinaio.rifornisci(controlDouble(),tipo);
    menu();
  }

  public static void aggiornaPrezzo(){
    System.out.println("quale prezzo vuoi aggiornare? \n 1-benzina \n 2-GPL \n altro- torna al menu");
    boolean tipo = true;

    switch (scan.nextLine()) {
      case "1":
        tipo = true;
        break;
      case "2":
        tipo = false;
        break;
    
      default:
        break;
    }



    System.out.println("quanto? ");
    benzinaio.aggiorna(controlDouble(),tipo);
    menu();
  }

  public static void serbatoglioAuto(){
    auto.getGas();
    menu();
  }
}
