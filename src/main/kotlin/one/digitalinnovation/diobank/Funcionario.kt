package one.digitalinnovation.diobank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {
}