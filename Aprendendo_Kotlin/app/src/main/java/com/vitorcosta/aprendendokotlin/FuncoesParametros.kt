package com.vitorcosta.aprendendokotlin

fun somar(n1: Int, n2: Int = 0, n3: Int = 0) {
    println(n1 + n2 + n3)
}


fun main() {

//    somar(10, n3 = 10)
    somar(n2 = 10, n1 = 5)

}
