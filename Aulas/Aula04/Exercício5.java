public class Exercício5{
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(false, 0);
        c1.abrirConta("cp");
        c1.MeusDados(); 
        c1.fecharConta();
        c1.pagarMensal();
    }
}