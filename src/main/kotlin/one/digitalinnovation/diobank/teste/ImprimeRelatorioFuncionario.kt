package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Analista
import one.digitalinnovation.diobank.Funcionario

class ImprimeRelatorioFuncionario(Alan: Analista) {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}