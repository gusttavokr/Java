public class ContaBanco {
    //Atributos
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    public boolean status;

    // Métodos especiais
    public ContaBanco(boolean st, float s) {
        this.status = false;
        this.saldo = 0;
    }

    public String getnumConta(){
        return this.numConta;
    }

    public void setnumConta(String c){
        this.numConta = c;
    }

    public String gettipo(){
        return this.tipo;
    }

    public void settipo(String t){
        this.tipo = t;
    }

    public String getdono(){
        return this.dono;
    }

    public void setdono(String d){
        this.dono = d;
    }

    public float getsaldo(){
        return this.saldo;
    }

    public void setsaldo(float s){
        this.saldo = s;
    }

    public boolean getstatus(){
        return this.status;
    }

    public void setstatus(boolean st){
        this.status = st;
    }


    // Métodos
    public void abrirConta(String t){
        settipo(t);
        setstatus(true);

        if (this.tipo == "cc"){
            saldo = 50; 
        }

        if (this.tipo == "cp"){
            saldo = 150;
        }
        System.out.println("A conta acaba de ser aberta");
    }
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta com dinheiro");
        }
        else if (saldo < 0){
            System.out.println("Conta em débito");
        }
        else{
            setstatus(false);
            System.out.println("A conta acaba de ser fechada");
        }
    }
    public void sacar(float v){
        if (this.status == true){
            if (this.saldo > 0){
                saldo = saldo - v;
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossível sacar");
        }
    }

    public void depositar(float v){
        if (this.status == true){
            saldo = getsaldo() + v;
        }
        else{
            System.out.println("Impossível depositar");
        }
    }

    public void pagarMensal(){
        if (status == true){
            if (this.tipo == "cc"){
                System.out.println("Sua mensalidade é de R$ 12");
            }
            else{
                System.out.println("Sua mensalidade é de R$ 20");
            } 
        }
        else{
            System.out.println("Impossível pagar");
        }
    }

    public void MeusDados(){
        System.out.println("Meu numero da conta: " + this.numConta);
        System.out.println("Meu tipo de conta: " + this.tipo);
        System.out.println("O dono da conta: " + this.dono);
        System.out.println("O saldo da conta: " + this.saldo);
        System.out.println("Status da conta: " + this.status);
    }
}
