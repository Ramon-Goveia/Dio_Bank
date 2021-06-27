package one.digitalinnovation.diobank

class Pessoa {
    var nome: String = "Ramon"
    var cpf: String = "111.111.111.11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val kotlin = Pessoa()
    println(kotlin.pessoaInfo())
}
