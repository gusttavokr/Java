package Exercícios.praticandoaula2;

public class Cadeira{
    String cor_principal;
    String cor_secundaria;
    int pernas;
    boolean rodas;

    void status(){
        System.out.println("A cor da cadeira é: " + this.cor_principal + " e " + this.cor_secundaria);
        System.out.println("A cadeira tem: " + this.pernas + " pernas");
        System.out.println("A cadeira tem: " + this.rodas + " rodas");
    }
    void andar(){
        if (this.rodas == true){
            System.out.println("Esta cadeira anda!");
        }
        else{
            System.out.println("Esta cadeira não anda");
        }
    }
}