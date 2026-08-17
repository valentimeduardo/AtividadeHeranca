class Gerente extends Funcionario{
    constructor(nome, idade, cargo, setor ){
        super(nome, idade, cargo)
        this.setor = setor;
    }

    autorizarCompra() {
        alert("Compra autorizada pelo gerente!");
    }
}