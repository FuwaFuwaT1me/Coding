package org.example.base.cohesion_coupling.destructive_decoupling.good

class Order {

    private val lines = mutableListOf<OrderLine>()

    fun amount(): Double {
        return lines.sumOf { it.price }
    }

    fun addLine(product: Product, price: Double) {
        lines.add(OrderLine(product, price))
    }
}

interface Product

data class OrderLine(
    val product: Product,
    val price: Double
)