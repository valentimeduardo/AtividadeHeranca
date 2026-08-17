public class Bancario{
    protected int Conta;
    protected int Agencia;

    public Bancario(int Conta, int Agencia){
        this.Conta = Conta;
        this.Agencia = Agencia;
    }
    //@Override
    public void exibirinformacoes(){
        System.out.println("Conta:" + Conta);
        System.out.println("Agencia:" + Agencia);
    }
}

