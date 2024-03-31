package org.example.proxy

abstract class Cell(
    private val left: Int,
    private val top: Int,
    private var status: CellStatus = CellStatus.CLOSED
) {

    abstract fun getPoints(): Int

    /**
     * Какая то ресурсоемкая операция. Например, загрузка изображения для отображения содержимого ячейки
     */
    fun open() {
        status = CellStatus.OPENED
    }
}