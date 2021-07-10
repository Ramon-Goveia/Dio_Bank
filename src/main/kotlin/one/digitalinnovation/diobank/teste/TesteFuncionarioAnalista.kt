package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Analista

fun main() {
    val Alan = Analista("Alan Goveia", "1234567899",2000.0)

    ImprimeRelatorioFuncionario.imprime(Alan)
}