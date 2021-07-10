package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Cliente
import one.digitalinnovation.diobank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-78",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}