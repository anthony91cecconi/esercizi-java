package modulo5.esercizio9.classi;

public class DistributoreBenzina {
    private double depositoBenzina;
    private double depositoGpl;
    private double euroPerLitroBenzina;
    private double euroPerLitroGpl;
    
    public DistributoreBenzina(){
        this.depositoBenzina = 0;
        this.depositoGpl = 0;
    }

    public void rifornisci(double unaQuantita , boolean tipo){
        if (tipo) {
            this.depositoBenzina += unaQuantita;
            System.out.println("rifornimento riuscito");
        }else{
            this.depositoGpl += unaQuantita;
            System.out.println("rifornimento riuscito");
        }
        
    }

    public void vendi(double euro, Car unaAutomobile){
        double gas = convertiEuroInLitri(euro, unaAutomobile);
        boolean rifornimeto = unaAutomobile.getTipoGas().toUpperCase().equals("BENZINA")? true:false;

        boolean calcolo = rifornimeto?   ((this.depositoBenzina - gas)> 1):((this.depositoGpl - gas)> 1);
        


        if(calcolo){
            System.out.println("rifornimento possibile");
            if (rifornimeto) {
                this.depositoBenzina -= gas;
            }
            this.depositoGpl =- gas;
            unaAutomobile.addGas(gas);
        }else{
            System.out.println("rifornimento non possibile, carburante nel distributore insufficente");
        }
    }

    public void aggiorna(double unPrezzoPerLitro , boolean tipo){

        if (tipo) {
            this.euroPerLitroBenzina = unPrezzoPerLitro;
            System.out.println("ora la benzina costa = " + this.euroPerLitroBenzina);
        }else{
            this.euroPerLitroGpl = unPrezzoPerLitro;
            System.out.println("ora il GPL costa = " + this.euroPerLitroGpl);
        }
        
    }

    public double getPrezzo(Car unaAutomobile){
        boolean tipo = unaAutomobile.getTipoGas().toUpperCase().equals("BENZINA")? true:false;
        if(tipo){
            return this.euroPerLitroBenzina;
        }else{
            return this.euroPerLitroGpl;
        }
    }

    private double convertiEuroInLitri(double euro, Car unaAutomobile){
        boolean tipo = unaAutomobile.getTipoGas().toUpperCase().equals("BENZINA")? true:false;

        if (tipo) {
            return  euro * euroPerLitroBenzina;
        }
        
        return euro * euroPerLitroGpl;

    }

    private double convertiInLitriEuro(double litri, Car unaAutomobile){
        boolean tipo = unaAutomobile.getTipoGas().toUpperCase().equals("BENZINA")? true:false;

        if (tipo) {
            return  litri / euroPerLitroBenzina;
        }
        
        return litri / euroPerLitroGpl;

    }
}
