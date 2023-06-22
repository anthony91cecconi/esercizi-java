package modulo3.file.automobile;

import java.util.Scanner;

import modulo3.file.automobile.classi.Car;
import modulo3.file.automobile.classi.DistributoreBenzina;

/*
 * Esercizio 3.3 – Car Testo:
    Progettare e realizzare una classe Car(automobile) con le proprietà seguenti. Un’automobile ha
    una determinata resa del carburante (misurata in miglia/galloni o in litri/chilometri: scegliete il
    sistema che preferite) e una certa quantità di carburante nel serbatoio. La resa è specificata dal
    costruttore e il livello iniziale del carburante è a zero. Fornire questi metodi: un metodo drive per
    simulare il percorso di un’automobile per una certa distanza, riducendo il livello di carburante nel
    serbatoio; un metodo getGas, per ispezionare il livello corrente del carburante; un metodo addGas
    per far rifornimento.
 */

 /*
  * Esercizio 3.4 – DistributoreBenzina Testo:
    Progettare una classe di nome DistributoreBenzina, per rappresentare un distributore di
    carburante per automobili. Tale classe prevede due variabili d'istanza. La prima chiamata deposito,
    di tipo double, e contiene il quantitativo di benzina disponibile al distributore. La seconda,
    chiamata euroPerLitro, di tipo double, rappresenta il prezzo della benzina, espresso in euro per
    litro.
    La classe deve implementare un costruttore public DistributoreBenzina(double unPrezzoPerLitro),
    che prende come parametro esplicito il prezzo in euro per un litro di benzina. La quantita' iniziale
    di benzina disponibile e' zero. La classe deve inoltre implementare i seguenti metodi: public void
    rifornisci(double unaQuantita), che rifornisce il distributore di benzina. public void vendi(double
    euro, Car unaAutomobile) che vende una quantita' di benzina corrispondente all'ammontare di
    euro pagato che va a rifornisce l'automobile passata come parametro esplicito. public void
    aggiorna(double unPrezzoPerLitro), che aggiorna il prezzo della benzina.
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
    auto = new Car(10);
    benzinaio = new DistributoreBenzina(0);

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
    System.out.println("litri ");
    benzinaio.rifornisci(controlDouble());
    menu();
  }

  public static void aggiornaPrezzo(){
    System.out.println("quanto? ");
    benzinaio.aggiorna(controlDouble());
    menu();
  }

  public static void serbatoglioAuto(){
    auto.getGas();
    menu();
  }
}
