public class Corrente extends Bancario {
    private int ValorSaque;
    private int Limite;

    public Corrente(int Conta, int Agencia, int ValorSaque, int Limite){
        super(Conta, Agencia);
        this.ValorSaque = ValorSaque;
        this.Limite = Limite;
    }

    @Override
    public void exibirinformacoes (){
        System.out.println("====CORRENTE====");
        System.out.println("Conta:" + Conta);
        System.out.println("Agencia:" + Agencia);
        System.out.println("ValorSaque:" + ValorSaque);
        System.out.println("Limite:" + Limite);
        
    }
}

