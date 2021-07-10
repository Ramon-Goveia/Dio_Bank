package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Gerente

fun main() {
    val Ramon = Gerente("Ramon Goveia", "12345678-99",10000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(Ramon)

    TesteAutenticacao().autentica(Ramon)
}