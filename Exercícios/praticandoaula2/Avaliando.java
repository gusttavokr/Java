package Exercícios.praticandoaula2;

public class Avaliando{
    public static void main(String[] args) {
        Cadeira cadeira_colabinf = new Cadeira();
        cadeira_colabinf.cor_principal = "Ciano";
        cadeira_colabinf.cor_secundaria = "Preto";
        cadeira_colabinf.pernas = 5;
        cadeira_colabinf.rodas = true;

        cadeira_colabinf.status();
        cadeira_colabinf.andar();
    }
}