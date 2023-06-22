package modulo3.file.esercizio1.classi;

public class Banca {
    private String nomeConto;
    private int saldo;
    private int interesse;

    public Banca(String nome,int saldo,int interesse){
        this.interesse = interesse;
        this.nomeConto = nome;
        this.saldo =saldo - ((saldo /100) * interesse );
    }

    public void versa(int cifra){
        System.out.println(interesse);
        this.saldo = this.saldo + cifra;
    }

    public void ritira(int cifra){
        this.saldo = this.saldo - cifra;
    }

    public void saldo(){
        System.out.println("il saldo del conto " + this.nomeConto + " è " + this.saldo);
    }

}
