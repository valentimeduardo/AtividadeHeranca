class produtoELetronico extends Produto{
    constructor(nomeProduto, preco, codigo){
        super(nomeProduto, preco);
        this.codigo = codigo;
    }

    mostrarProduto(){
        super.mostrarProduto();
        console.log("Código: " + this.codigo);
    }
}