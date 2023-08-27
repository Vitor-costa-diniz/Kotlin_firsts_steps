package com.vitorcosta.aprendendokotlin

class Jogador {

    var kart: String = ""
    var pneu: String = ""
    var planador: String = ""

    fun acelerar( aceleracao: Int = 0 ) {
        println("Acelerar na velcidade: $aceleracao")

    }

//    fun retornarPoder(): String {
//        return  "Casco Vermelho"
//    }
    fun retornarPoder(): String = "Casco Vermelho"

}

fun main() {

    val jogador = Jogador()
//    jogador.kart = "Kart do Mario"
    val poder = jogador.retornarPoder()
    println(poder)
//    jogador.acelerar(aceleracao = 80)
//    println(jogador.kart)


}