class Produto{
    constructor(nomeProduto, preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    mostrarProduto(){
        console.log("Nome do produto: " + this.nomeProduto);
        console.log("Preço: R$ " + this.preco);
    }
}