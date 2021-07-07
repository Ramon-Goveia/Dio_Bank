package one.digitalinnovation.diobank.teste

import one.digitalinnovation.diobank.Banco

fun main(){
    val dioBank = Banco("DioBank", 33 )

    println(dioBank.nome)
    println(dioBank.numero)

    val banco2 = dioBank.copy(nome = "Nome2")

    println(banco2.info())
}