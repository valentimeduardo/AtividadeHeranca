class contaBancaria{
    constructor(titular, saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    depositar(valor) {
        this.saldo += valor;
        alert("Depósito realizado!");
    }

    sacar(valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            alert("Saque realizado!");
        } else {
            alert("Saldo insuficiente!");
        }
    }

    consultarSaldo() {
        alert("Saldo: R$ " + this.saldo);
    }
}