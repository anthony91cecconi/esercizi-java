package modulo5.esercizio8.classi;

public class Banca {
    private String nomeConto;
    private int saldo;
    private int interesse;
    private int pass;
    private boolean passConfirmed;

    public Banca(String nome,int saldo,int interesse ,int pass){
        this.interesse = interesse;
        this.passConfirmed = false;
        this.nomeConto = nome;
        this.saldo =saldo - ((saldo /100) * interesse );
        this.pass = pass;
    }

    public void versa(int cifra){
        if (passConfirmed) {
            System.out.println("versati " + cifra + "€");
            this.saldo = this.saldo + cifra;
        } else {
            System.out.println("pasword non confermata" + interesse);
        }
        
    }

    public void ritira(int cifra){
        if (passConfirmed) {
            System.out.println("ritirati " + cifra + "€");
            this.saldo = this.saldo - cifra;
        } else {
            System.out.println("pasword non confermata");
        }
    }

    public void saldo(){
        System.out.println("il saldo del conto " + this.nomeConto + " è " + this.saldo + "€");
    }

    public boolean controlPassword(int pass){
        boolean controll =this.pass == pass;
        if(controll){
            this.passConfirmed = true;
        }
        return controll;
    }

    public String getNomeConto() {
        return nomeConto;
    }

}
