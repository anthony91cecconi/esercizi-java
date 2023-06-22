package esempio;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        menu();

        scan.close();
    }

    public static void menu(){
        
        System.out.println("1. saluti");

        int scelta = scan.nextInt();

        switch (scelta) {
            case 1:
                saluti();
                break;
        
            default:
                offese();
                break;
        }

    }

    public static void saluti(){
        System.out.println("ciao");
    }

    public static void offese(){
         System.out.println("bastardo");
    }

}
