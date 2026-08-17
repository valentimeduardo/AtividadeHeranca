class Aluno extends Pessoa{
    constructor(nome, idade, curso){
        super(nome, idade);
        this.curso=curso;
    }

    estudar(){
        return`
        Nome:${this.nome}
        Idade:${this.idade}
        Curso:${this.curso}
        `;
    }
}

const pessoa1 = new Pessoa(
    "Eduardo",
    17
)

const aluno1 = new Aluno(
    "Eduardo",
    17,
    "Técnico em Desenvolvimento de Sistemas"
)