class Veiculo{
    constructor(marca, ano){
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
        this.portaAberta = false;
    }

    ligar(){
        this.ligado = true;
        alert("O carro" + this.marca + "está ligado!");
    }
    abrirPorta() {
        this.portaAberta = true;
        alert("A porta foi aberta!");
    }
}