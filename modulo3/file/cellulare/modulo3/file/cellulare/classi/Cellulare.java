package modulo3.file.cellulare.classi;

public class Cellulare {
    private double carica;
    private int numeroChiamate;
    public double costo;

    public Cellulare(double unaCarica){
        this.carica = unaCarica;
        this.costo = 0.20;
        azzeraChiamate();
    }

    public void ricarica(double unaRicarica){
        this.carica += unaRicarica;
        System.out.println("ricarica effettuata");
    }

    public void chiama(double minutiDurata){
        double calcolo = this.carica - (this.costo * minutiDurata);
        
        if(calcolo > 0){
            this.carica=calcolo;
            this.numeroChiamate++;
            System.out.println("chiamata effettuata ");
        }else{
            System.out.println("chiamata non possibile, credito insufficiente ");
        }

        
    }

    public double numero404(){
        return this.carica;
    }

    public int getNumeroChiamate(){
    return this.numeroChiamate;
    }

    public void azzeraChiamate(){
        this.numeroChiamate = 0;
        System.out.println("chiamate azzerate");
    }
}
