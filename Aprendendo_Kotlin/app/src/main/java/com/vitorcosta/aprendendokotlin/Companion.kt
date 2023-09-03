package com.vitorcosta.aprendendokotlin

class Carro(
    var modelo: String = "",
    var velocidade: Int = 0
) {

    companion object {
        const val VELOCIDADE_MAX_PERMITIDA: Int = 120
        fun exibirMensagemVelocidadeMaxima() {
            println("Velocidade máxima permitida: ${Carro.VELOCIDADE_MAX_PERMITIDA}")
        }
    }

    fun exibirInformacoes() {
        println("Informações: $modelo e $velocidade")
    }

}

class Usuario {

    companion object {
        fun verificarUsuarioLogado(): Boolean {
            //Verificação
            return true
        }
    }

}

fun main() {

    val retorno = Usuario.verificarUsuarioLogado()
    println("Usuario logado: $retorno")

//    Carro.exibirMensagemVelocidadeMaxima()
//
//    val fusca = Carro("Fusca", 100) //Criando uma instancia ou objeto
//    fusca.exibirInformacoes()
//
//
//    val ferrari = Carro("Ferrari", 200) //Criando uma instancia ou objeto
//    ferrari.exibirInformacoes()
//
//    println("PI: ${Math.PI}")

}