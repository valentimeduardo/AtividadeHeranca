class contaCorrente extends contaBancaria{
    constructor(titular, saldo, limite){
        super(titular, saldo);
        this.limite = limite;
    }

    usarLimite(valor) {
        if (valor <= this.limite) {
            this.saldo += valor;
            this.limite -= valor;
            alert("Limite utilizado!");
        } else {
            alert("Limite insuficiente!");
        }
    }
}