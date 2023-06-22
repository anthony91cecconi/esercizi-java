package modulo5.esercizio9.classi;

public class DistributoreBenzina {
    private double deposito;
    private double euroPerLitro;
    
    public DistributoreBenzina( double euroPerLitro){
        this.euroPerLitro =  euroPerLitro;
        this.deposito = 0;
    }

    public void rifornisci(double unaQuantita){
        this.deposito += unaQuantita;
        System.out.println("rifornimento riuscito");
    }

    public void vendi(double euro, Car unaAutomobile){
        double gas = euro / euroPerLitro;
        double calcolo =   this.deposito - gas;
        if(calcolo > 1){
            System.out.println("rifornimento possibile");
            this.deposito = calcolo;
            unaAutomobile.addGas(gas);
        }else{
            System.out.println("rifornimento non possibile, carburante nel distributore insufficente");
        }

        
       
    }

    public void aggiorna(double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
        System.out.println("ora la benzina costa = " + this.euroPerLitro);
    }
}
