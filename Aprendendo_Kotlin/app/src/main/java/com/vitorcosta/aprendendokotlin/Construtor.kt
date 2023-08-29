package com.vitorcosta.aprendendokotlin

//Escrever Constructor é opcional

class Usuario ( //Construtor primário
    var nome: String = "",
    var sobrenome: String = ""
    )  {

//    var nome: String = ""
//    var sobrenome: String = ""

    init {
//        this.nome = nomeP
//        this.sobrenome = sobrenomeP
        println("Objeto Inicializado")
        println("nome: $nome e sobrenome: $sobrenome")
    }

    constructor(nome: String): this(nome, "") { //Construtor Secundario
        println("Construtor secundário")
    }
}

fun main() {

    val usuario = Usuario("vitor")
//    usuario.nome = "Vitor"

}