package one.digitalinnovation.diobank

class Pessoa {
    var nome: String = "Ramon"
    var cpf: String = "111.111.111.11"
}

fun main() {
    val kotlin = Pessoa()

    println(kotlin.nome)
    println(kotlin.cpf)
}
