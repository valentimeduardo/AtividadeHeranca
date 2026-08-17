public class Gerente extends Funcionarios{
    private String Setor;

    public Gerente(String Nome, int Idade, String Funcao, String Setor){
        super(Nome, Idade, Funcao);
        this.Setor = Setor;
    }
    
    @Override
    public void exibirinformacoes(){
        System.out.println("====GERENTE====");
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("Funcao:" + Funcao);
        System.out.println("Setor:" + Setor);
    }
}