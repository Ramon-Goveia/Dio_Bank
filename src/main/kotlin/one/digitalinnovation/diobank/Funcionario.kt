package one.digitalinnovation.diobank

abstract class Funcionario(
    val salario: Double,
    nome: String,
    cpf: String,
) : Pessoa(nome, cpf) {
    protected abstract fun calcAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calcAuxilio()}
    """.trimIndent()
}