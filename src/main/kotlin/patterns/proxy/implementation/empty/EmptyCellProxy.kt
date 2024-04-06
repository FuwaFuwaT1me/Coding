package org.example.patterns.proxy.implementation.empty

import org.example.patterns.proxy.implementation.base.Cell
import org.example.patterns.proxy.implementation.base.CellStatus

/**
 * Прокси для пустой ячейки
 */
class EmptyCellProxy(
    private val left: Int,
    private val top: Int
): Cell(left, top) {

    private var emptyCell: EmptyCell? = null

    override fun open() {
        if (emptyCell == null) {
            emptyCell = EmptyCell(left, top)
        }
        emptyCell?.open()
    }

    override fun getPoints(): Int = emptyCell?.getPoints() ?: 100
    override fun getLeft(): Int = emptyCell?.getLeft() ?: left
    override fun getTop(): Int = emptyCell?.getTop() ?: top
    override fun getStatus(): CellStatus = emptyCell?.getStatus() ?: status
}