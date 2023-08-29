package com.vitorcosta.aprendendokotlin

open class Animal { //Classe pai, super classe
    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0

    open fun correr() {
        println("Correr como um")
    }
    fun dormir() {
        println("Dormir")
    }

}

class Cao: Animal() { //Subclasse ou classe filha
    fun latir() = println("Latir")
    override fun correr() {
        super.correr()
        println("cão de 4 patas")
    }
}

class Passaro: Animal() {
    fun voar() = println("Voar")
    override fun correr() {
        super.correr()
        println("pássaro de 2 perninhas")
    }
}

fun main() {
    val cao = Cao()
    cao.correr()
//    cao.latir()

    val passaro = Passaro()
    passaro.correr()
//    passaro.voar()
}