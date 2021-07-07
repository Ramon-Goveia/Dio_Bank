package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Funcionario
import one.digitalinnovation.diobank.Pessoa
import java.math.BigDecimal

fun main() {
    val kotlin = Pessoa(nome = "Nome: Ramon Goveia",
        cpf = "Cpf: 1234567899")
    println(kotlin.nome)
    println(kotlin.cpf)

    val Alan = Funcionario("Nome: Alan Goveia", "Cpf: 1234567899", BigDecimal.valueOf(2000.0))
    println(Alan.nome)
    println(Alan.cpf)
    println(Alan.salario)
}