public class Poupanca extends Bancario {
    private int ValorDeposito;
    private int Saldo;

    public Poupanca(int Conta, int Agencia, int ValorDeposito, int Saldo){
        super(Conta, Agencia);
        this.ValorDeposito = ValorDeposito;
        this.Saldo = Saldo;
    }

    @Override
    public void exibirinformacoes (){
        System.out.println("====POUPANCA====");
        System.out.println("Conta:" + Conta);
        System.out.println("Agencia:" + Agencia);
        System.out.println("ValorDeposito:" + ValorDeposito);
        System.out.println("Saldo:" + Saldo);
        
    }
}

