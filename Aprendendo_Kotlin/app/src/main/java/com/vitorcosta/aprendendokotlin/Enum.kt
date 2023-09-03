package com.vitorcosta.aprendendokotlin

// aguardando_aprovacao
// pedido_realizado, pagamento_confirmado
// pedido_enviado, pedido_entregue

enum class StatusPedido {
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {

}

fun main() {

    //Tela de compras
    val pedido = Pedido(125.90, "camiseta, livro")

    //Pagamento com cartão
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    //Transportadora
//    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO

    println("StausPedido: ${StatusPedido.PEDIDO_ENVIADO.ordinal}")

    //Histórico de compras
    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO) {
        println("O seu pedido foi realizado")

    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("O seu pedido foi enviado")

    } else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO) {
        println("O seu pagamento foi confirmado")
    }

}
