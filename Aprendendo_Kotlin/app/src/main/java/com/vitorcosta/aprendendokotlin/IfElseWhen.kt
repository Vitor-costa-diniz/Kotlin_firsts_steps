package com.vitorcosta.aprendendokotlin

fun main() {

//    val notaAluno = 7
//    val condicao = notaAluno >= 6

//    val opcao = 1
//
//    if (opcao == 1) {
//        println("Cartao de crédito")
//    } else if( opcao == 2) {
//        println("Extrato bancário")
//    } else if( opcao == 3) {
//        println("Saldo")
//    } else {
//        println("Nenhuma opção selecionada")
//    }

//    val opcao = 10
//
//    if (opcao in 1..3) {
//        println("opções selecionadas: 1, 2 e 3")
//    } else if ( opcao in 4..8) {
//        println("opções selecionadas: 4 até 8")
//    }

    val opcao = 4
//    println("Cartao de crédito")
//    println("Extrato bancário")
//    println("Saldo")
    when (opcao ) {
        1 -> println("Cartao de crédito")
        2 -> println("Extrato bancário")
        in 3..5 -> println("Saldo")
        else -> println("Nenhuma opção selecionada")
    }

}