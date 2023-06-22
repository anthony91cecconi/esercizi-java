package modulo5.esercizio9;

import java.util.Scanner;

import modulo3.file.automobile.classi.Car;
import modulo3.file.automobile.classi.DistributoreBenzina;

/*
      Esercizio 5.9 – CarFuel Testo:
    Modificare la classe Car2, assegnata nell’esercizio 3.4, in modo tale che la macchina riconosca il
    tipo di carburante che consuma(benzina o gasolio). Implementate inoltre i seguenti metodi: void
    aggiungiCarburante(double litri) che aggiunge carburante al serbatoio della macchina. void
    faiUnGiro(double kilometri) che simula una corsa di un'auto per un determinato numero di km.
    boolean usaBenzina() che restituisce se il carburante della macchina è benzina. boolean
    usaGasolio() che restituisce se il carburante della macchina è gasolio. double getSerbatoio()che
    restituisce il numero di litri di carburante rimanenti nel serbatoio. String getTipoDiCarburante()
    che restituisce il tipo di carburante della macchina.
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
