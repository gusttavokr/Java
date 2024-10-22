public class Cadeira {
    private String cor;
    private int pernas;
    private int rodas;

    public Cadeira(String c, int p, int r) {
        this.cor = c;
        this.pernas = p;
        this.rodas = r;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
}
