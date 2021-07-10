package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Analista
import one.digitalinnovation.diobank.Funcionario

fun main() {
    val Alan = Analista("Alan Goveia", "1234567899",2000.0)
    ImprimeRelatorio(Alan)
}

fun ImprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())