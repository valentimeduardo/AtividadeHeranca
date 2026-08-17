public class Veiculos{
    private String Modelo;
    private String Marca;
    private int Ano;

    public Veiculos(String Modelo, String Marca, int Ano){
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Ano = Ano;
    }
    public void exibirinformacoes(){
        System.out.println("Modelo:" + Modelo);
        System.out.println("Marca:" + Marca);
        System.out.println("Ano:" + Ano);
    }
}