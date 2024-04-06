package org.example.patterns.proxy.implementation.mine

import org.example.patterns.proxy.implementation.base.Cell
import org.example.patterns.proxy.implementation.base.CellStatus

/**
 * Прокси для мины
 */
class MineCellProxy(
    private val left: Int,
    private val top: Int
): Cell(left, top) {

    private var mineCell: MineCell? = null

    override fun open() {
        if (mineCell == null) {
            mineCell = MineCell(left, top)
        }
        mineCell?.open()
    }

    override fun getPoints(): Int = mineCell?.getPoints() ?: 100
    override fun getLeft(): Int = mineCell?.getLeft() ?: left
    override fun getTop(): Int = mineCell?.getTop() ?: top
    override fun getStatus(): CellStatus = mineCell?.getStatus() ?: status
}