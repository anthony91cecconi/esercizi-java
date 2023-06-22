package modulo5.esercizio9.classi;

public class Car {
    private double fuelYield;
    private double gas;
    private String tipoDiGas;

    public Car(double fuelYield , String tipoDiGas){
        this.fuelYield = fuelYield;
        this.gas = 0;
        this.tipoDiGas = tipoDiGas;
    }

    public void drive(double km){
        double calcolo = this.gas - (this.fuelYield * km);
        
        if(calcolo > 0){
            System.out.println("viaggio riuscito");
            this.gas = calcolo;
        }else {
            System.out.println("viaggio non possibile, poco carburante");
        }
    }

    public void getGas(){
        System.out.println("il serbatoglio contiene " + gas);
    }

    public void addGas(double gas){
        System.out.println("rifornimento riuscito");
        this.gas += gas;
    }

    public String getTipoGas(){
        return this.tipoDiGas;
    }
}
