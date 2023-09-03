package com.vitorcosta.aprendendokotlin

abstract class Animal { //Classe pai, super classe, Abstrata
    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0

    open fun correr() {
        println("Correr como um")
    }
    abstract fun dormir()

}

class Cao: Animal() { //Subclasse ou classe filha, Concreta
    fun latir() = println("Latir")
    override fun correr() {
        super.correr()
        println("cão de 4 patas")
    }

    override fun dormir() {
        println("Dormir como um cão")
    }
}

class Passaro: Animal() {
    fun voar() = println("Voar")
    override fun correr() {
        super.correr()
        println("pássaro de 2 perninhas")
    }

    override fun dormir() {
        println("Dormir como um pássaro")
    }
}

fun main() {

//    val animal = Animal()
//    animal.correr()

    val cao = Cao()
    cao.correr()
    cao.latir()
//
//    val passaro = Passaro()
//    passaro.correr()
////    passaro.voar()
}