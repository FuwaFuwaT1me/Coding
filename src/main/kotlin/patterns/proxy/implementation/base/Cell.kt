package org.example.patterns.proxy.implementation.base

abstract class Cell(
    private val left: Int,
    private val top: Int
) {

    protected var status: CellStatus = CellStatus.CLOSED

    abstract fun getPoints(): Int

    /**
     * Какая то ресурсоемкая операция. Например, загрузка изображения для отображения содержимого ячейки
     */
    open fun open() {
        status = CellStatus.OPENED
    }

    open fun getLeft(): Int = left
    open fun getTop(): Int = top
    open fun getStatus(): CellStatus = status
}