package Aulas.Aula03;

package Aulas.Aula03;

public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public escrever(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        }
        else{
            System.out.println("Estou Rabiscando!");
        }
    }
}

// Não está correto