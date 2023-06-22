package modulo5.esercizio4;
/*
 * Esercizio 5.4 – Voti Testo:
    Scrivete un programma per convertire la lettera di un voto scolastico nel numero corrispondente.
    Le lettere sono A, B, C, D e F, eventualmente seguite dai segni + o -. I loro valori numerici sono 4, 3,
    2, 1 e 0. F+ e F- non esistono. Un segno + o – incrementa o decrementa il valore numerico di 0.3.
    Tuttavia, A+ è uguale a 4.0. Usate una classe Grade con un metodo getNumericGrade.
 */

import java.util.Scanner;

import modulo5.esercizio4.classi.Grade;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();
        Scanner scan = new Scanner(System.in);
        System.out.println("inserire voto");
        String voto = scan.nextLine();

        System.out.println("il voto vale " + grade.convert(voto));

        scan.close();
    }
}
