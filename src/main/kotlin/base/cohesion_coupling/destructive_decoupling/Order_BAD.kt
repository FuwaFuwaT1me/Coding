package org.example.base.cohesion_coupling.destructive_decoupling.bad

class Order(
    private val factory: OrderLineFactory,
    private val calculator: OrderPriceCalculator
) {

    private val lines = mutableListOf<OrderLine>()

    fun amount(): Double {
        return calculator.calculateAmount(lines)
    }

    fun addLine(product: Product, price: Double) {
        lines.add(
            factory.createOrderLine(product, price)
        )
    }
}

interface OrderLineFactory {

    fun createOrderLine(product: Product, price: Double): OrderLine
}

interface OrderPriceCalculator {

    fun calculateAmount(lines: List<OrderLine>): Double
}

interface Product

interface OrderLine