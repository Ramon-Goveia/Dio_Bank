package one.digitalinnovation.diobank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(salario, nome, cpf) {
    override fun calcAuxilio() = salario * 0.1
}