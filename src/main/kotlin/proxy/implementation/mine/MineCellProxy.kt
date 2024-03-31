package org.example.proxy.implementation.empty

import org.example.proxy.implementation.base.Cell
import org.example.proxy.implementation.base.CellStatus

/**
 * Прокси для пустой ячейки
 */
class EmptyCellProxy(
    private val left: Int,
    private val top: Int
): Cell(left, top) {

    private val emptyCell by lazy { EmptyCell(left, top) }

    override fun open() {
        emptyCell.open()
    }

    override fun getPoints(): Int = emptyCell.getPoints()
    override fun getLeft(): Int = emptyCell.getLeft()
    override fun getTop(): Int = emptyCell.getTop()
    override fun getStatus(): CellStatus = emptyCell.getStatus()
}